package com.hand.test.dto;

/**
 * @ Author: xin
 * @ Date: 2018/11/7 15:57
 */
public class SysUser {
    private String username;
    private String password;
    private String authority;

    public SysUser() {
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }
}
