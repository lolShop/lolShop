package edu.nf.lol.comment.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author Administrator
 * @date 2020/3/9
 */
@Data
public class ReturnContent {
    private Integer returnId;
    private Integer comId;
    private Integer returnParentId;
    private Integer userId;
    private String content;
    private Date returnDate;
    private Integer likeNum;
}