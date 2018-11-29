package com.hand.test.controller;

import com.google.gson.JsonObject;
import com.hand.test.dto.Employee;
import org.springframework.security.access.intercept.AbstractSecurityInterceptor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.authentication.logout.LogoutHandler;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import redis.clients.jedis.Jedis;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static org.springframework.data.repository.init.ResourceReader.Type.JSON;

/**
 * @ Author: xin
 * @ Date: 2018/11/8 9:00
 */
@Controller
public class Test implements Serializable {

    private static final long serialVersionUID = -2178326433832024472L;

    @RequestMapping("/t5")
    @ResponseBody
    public String get(){
        return "t5";
    }

    public static void main(String[] args) {
        Jedis j=new Jedis("106.12.86.12",6379);
        j.set("123","12");
        System.out.println(j.get("123"));
        ArrayList a=new ArrayList();
        a.add("123");
        a.add(true);
        a.size();
        Map<String,Object> map=new HashMap<>();
        Employee employee=new Employee();
        employee.setAge("10");
        map.put("oldNum","001");
        map.put("datas",employee);
        System.out.println(map);
//        System.out.println(com.alibaba.fastjson.JSONObject.toJSON(map));
//        AuthenticationManager
//        WebSecurityConfigurerAdapter
//        LogoutHandler
//        LogoutSuccessHandler
//        AuthenticationProvider
//        UserDetailsService
//        AbstractSecurityInterceptor

    }


}
