package edu.nf.lol.user.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author zhangch
 * @date 2020/3/9
 * 浏览足迹表
 */
@Data
public class Footprint {

    private Integer footId;
    private Date footDate;
    private User user;
    //差一个浏览的商品对象

}
