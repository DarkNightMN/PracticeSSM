package com.hand.test.controller;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.logout.LogoutHandler;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import redis.clients.jedis.Jedis;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * @ Author: xin
 * @ Date: 2018/11/8 9:00
 */
@Controller
public class Test implements Serializable {

    private static final long serialVersionUID = -2178326433832024472L;

    @RequestMapping("/t3")
    @ResponseBody
    public String get(){
        return "t3";
    }

    public static void main(String[] args) {
        Jedis j=new Jedis("106.12.86.12",6379);
        j.set("123","12");
        System.out.println(j.get("123"));
        ArrayList a=new ArrayList();
        a.add("123");
        a.add(true);
        a.size();
//        WebSecurityConfigurerAdapter
//        LogoutHandler
//        LogoutSuccessHandler
//        AuthenticationProvider
    }


}
