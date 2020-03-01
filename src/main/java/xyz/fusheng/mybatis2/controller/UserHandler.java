/**
 * Copyright (C), 2020-2020, code_fusheng
 * FileName: Userhandler
 * Author:   25610
 * Date:     2020/2/29 18:53
 * Description:
 * History:
 * <author>        <time>      <version>       <desc>
 * 作者姓名       修改时间       版本号         描述
 */
package xyz.fusheng.mybatis2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import xyz.fusheng.mybatis2.entity.User;
import xyz.fusheng.mybatis2.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserHandler {

    @Autowired
    private UserService userService;

    @GetMapping("/findUserById/{id}")
    public User findUserById(@PathVariable("id") Long id){
        return userService.findUserById(id);
    }

    @PutMapping("/updateUser")
    public int updateUser(@RequestBody User user){
        return userService.updateUser(user);
    }

    @DeleteMapping("/deleteUserById/{id}")
    public int deleteUserById(@PathVariable("id") Long id){
        return userService.deleteUserById(id);
    }

    @GetMapping("findUserColumns/{id}")
    public User findUserColumns(@PathVariable("id") Long id){
        return userService.findUserColumns(id);
    }

    @GetMapping("/findAllUser")
    public List<User> findAllUser(){
        return userService.findAllUser();
    }

}
