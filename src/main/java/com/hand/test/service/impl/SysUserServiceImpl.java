package com.hand.test.service.impl;

import com.hand.test.dto.SysUser;
import com.hand.test.mapper.SysUserMapper;
import com.hand.test.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ Author: xin
 * @ Date: 2018/11/7 16:02
 */
@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public Integer existUserByName(String username) {
        return sysUserMapper.existUserByName(username);
    }

    @Override
    public SysUser selectUserByName(String username) {
        return sysUserMapper.selectUserByName(username);
    }
}
