package com.hand.test.mapper;

import com.hand.test.dto.SysUser;

/**
 * @ Author: xin
 * @ Date: 2018/11/7 16:03
 */
public interface SysUserMapper {

    // 用户是否存在
    Integer existUserByName(String username);

    // 用户信息
    SysUser selectUserByName(String username);
}
