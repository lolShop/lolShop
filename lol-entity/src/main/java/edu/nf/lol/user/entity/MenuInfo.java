package edu.nf.lol.user.entity;

import lombok.Data;

/**
 * @author zhangch
 * @date 2020/3/8
 * 操作表菜单
 */
@Data
public class MenuInfo {

    private Integer menuid;
    private Integer parentId;
    private String menuName;
    private String menuUrl;
}
