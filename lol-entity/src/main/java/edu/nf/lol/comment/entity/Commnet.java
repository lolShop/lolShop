package edu.nf.lol.comment.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author Administrator
 * @date 2020/3/9
 */
@Data
public class Commnet {
    private Integer comId;
    private Integer userId;
    private Integer detailsId;
    private Integer description;
    private Integer delivery;
    private Integer service;
    private String content;
    private Date comDate;
    private Integer likeNum;
    private Integer parentId;


    //用户实体对象

    //订单明细实体对象

    //评论图片实体对象

    //追加评论实体对象

    //回复评论实体对象

    //评论举报实体对象
}