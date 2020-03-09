package edu.nf.lol.user.entity;

import lombok.Data;

/**
 * @author zhangch
 * @date 2020/3/8
 */
@Data
public class Collect {

    private Integer collectId;
    private User user;
    //差一个商品对象
}
