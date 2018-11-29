package com.hand.test.controller;

import com.hand.test.dto.SysUser;
import com.hand.test.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
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
    private AuthenticationManager authenticationManager;

    @RequestMapping("/loginAuth")
    public String login(SysUser sysUser){
        try {
            // 用户提交的username和password
            UsernamePasswordAuthenticationToken authRequest = new UsernamePasswordAuthenticationToken(sysUser.getUsername(), sysUser.getPassword());

            // 进行认证，【给方法会调用loadUserByUsername并返回UserDetais，并与用户的提交进行比对】
            Authentication authentication = authenticationManager.authenticate(authRequest);
            SecurityContextHolder.getContext().setAuthentication(authentication);
            return "employee";

        }catch (Exception e){
            return "redirect:/login.html";
        }
    }
}
