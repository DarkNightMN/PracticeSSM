package com.hand.test.controller;

import com.hand.test.dto.SysUser;
import com.hand.test.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ Author: xin
 * @ Date: 2018/10/10 14:49
 */
@Controller
public class LoginController {

    @Autowired
    private SysUserService sysUserService;

    @RequestMapping("/loginAuth")
    public String login(SysUser sysUser){
        Integer num=sysUserService.selectByName(sysUser);
        if(num>0){
            SysUser user=sysUserService.selectUser(sysUser);
            if(user!=null){
                return "employee";
            }
        }
        return "redirect:/login.html";
    }
}
