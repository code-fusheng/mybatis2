/**
 * Copyright (C), 2020-2020, code_fusheng
 * FileName: UserService
 * Author:   25610
 * Date:     2020/2/29 18:52
 * Description:
 * History:
 * <author>        <time>      <version>       <desc>
 * 作者姓名       修改时间       版本号         描述
 */
package xyz.fusheng.mybatis2.service;

import xyz.fusheng.mybatis2.entity.User;

import java.util.List;

public interface UserService {
    // 通过id查询用户信息
    User findUserById(Long id);
    // 更新user信息
    int updateUser(User user);
    // 根据id删除用户
    int deleteUserById(Long id);
    // 根据id查询user字段（columns）通过sql片段
    User findUserColumns(Long id);

    List<User> findAllUser();
}
