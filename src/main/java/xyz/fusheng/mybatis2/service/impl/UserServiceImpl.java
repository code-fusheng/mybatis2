/**
 * Copyright (C), 2020-2020, code_fusheng
 * FileName: UserServiceImpl
 * Author:   25610
 * Date:     2020/2/29 18:52
 * Description:
 * History:
 * <author>        <time>      <version>       <desc>
 * 作者姓名       修改时间       版本号         描述
 */
package xyz.fusheng.mybatis2.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.fusheng.mybatis2.entity.User;
import xyz.fusheng.mybatis2.repository.UserRepository;
import xyz.fusheng.mybatis2.service.UserService;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User findUserById(Long id) {
        return userRepository.findUserById(id);
    }
    @Override
    public int updateUser(User user) {
        return userRepository.updateUser(user);
    }
    @Override
    public int deleteUserById(Long id) {
        return userRepository.deleteUserById(id);
    }
    @Override
    public User findUserColumns(Long id) {
        return userRepository.findUserColumns(id);
    }

    @Override
    public List<User> findAllUser() {
        return userRepository.findAllUser();
    }
}
