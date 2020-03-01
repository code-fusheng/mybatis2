/**
 * Copyright (C), 2020-2020, code_fusheng
 * FileName: User
 * Author:   25610
 * Date:     2020/2/29 18:36
 * Description:
 * History:
 * <author>        <time>      <version>       <desc>
 * 作者姓名       修改时间       版本号         描述
 */
package xyz.fusheng.mybatis2.entity;

import lombok.Data;

@Data
public class User {
    private Long id;
    private String name;
    private String username;
    private String password;
}
