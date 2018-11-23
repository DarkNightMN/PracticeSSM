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
    public Integer selectByName(SysUser user) {
        return sysUserMapper.selectByName(user);
    }

    @Override
    public SysUser selectUser(SysUser user) {
        return sysUserMapper.selectUser(user);
    }
}
