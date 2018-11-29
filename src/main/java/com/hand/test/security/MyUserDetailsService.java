package com.hand.test.security;

import com.hand.test.dto.SysUser;
import com.hand.test.mapper.SysUserMapper;
import com.hand.test.service.SysUserService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.HashSet;
import java.util.Set;

/**
 * @ Author: xin
 * @ Date: 2018/11/29 9:27
 */
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private SysUserService sysUserService;

    private Set<GrantedAuthority> authorities=new HashSet<>();

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        // 查询此用户是否存在
        Integer count=sysUserService.existUserByName(username);

        if(count==0){
            throw new UsernameNotFoundException("User not found:"+username);
        }
        // 返回User
        SysUser sysUser= sysUserService.selectUserByName(username);
        authorities.add(new SimpleGrantedAuthority(sysUser.getAuthority()));
        return new User(
                sysUser.getUsername(),
                sysUser.getPassword(),
                authorities);
    }


}
