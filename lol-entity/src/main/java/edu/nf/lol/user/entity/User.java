package edu.nf.lol.user.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author zhangch
 * @date 2020/3/5
 * 用户信息
 */
@Data
public class User {

    private Integer userId;
    private String userPhone;
    private String password;
    private String userName;
    private String photo;
    private Boolean sex;
    private Date birthday;
    private String phone;
    private String email;

}