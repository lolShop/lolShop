package edu.nf.lol.user.entity;

import lombok.Data;

/**
 * @author zhangch
 * @date 2020/3/8
 * 用户对应的角色
 */
@Data
public class UserRole {

    private User user;
    private Role role;
}
