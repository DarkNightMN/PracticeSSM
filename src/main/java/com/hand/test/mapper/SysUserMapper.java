package com.hand.test.mapper;

import com.hand.test.dto.SysUser;

/**
 * @ Author: xin
 * @ Date: 2018/11/7 16:03
 */
public interface SysUserMapper {

    // 用户是否存在
    Integer selectByName(SysUser user);

    // 用户信息
    SysUser selectUser(SysUser user);
}
