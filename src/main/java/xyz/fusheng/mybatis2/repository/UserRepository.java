/**
 * Copyright (C), 2020-2020, code_fusheng
 * FileName: UserRepository
 * Author:   25610
 * Date:     2020/2/29 18:51
 * Description:
 * History:
 * <author>        <time>      <version>       <desc>
 * 作者姓名       修改时间       版本号         描述
 */
package xyz.fusheng.mybatis2.repository;

import org.springframework.stereotype.Repository;
import xyz.fusheng.mybatis2.entity.User;

import java.util.List;

@Repository
public interface UserRepository {
    User findUserById(Long id);
    int updateUser(User user);
    int deleteUserById(Long id);
    User findUserColumns(Long id);

    List<User> findAllUser();
}
