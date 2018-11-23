package com.hand.test.service;

import com.hand.test.dto.SysUser;

/**
 * @ Author: xin
 * @ Date: 2018/11/7 15:59
 */
public interface SysUserService {

    // 用户是否存在
    Integer selectByName(SysUser user);

    // 用户信息
    SysUser selectUser(SysUser user);
}
