package edu.nf.lol.user.entity;

import lombok.Data;

/**
 * @author zhangch
 * @date 2020/3/8
 * 角色操作权限表
 */
@Data
public class RoleMenu {

    private MenuInfo menu;
    private Role role;
}
