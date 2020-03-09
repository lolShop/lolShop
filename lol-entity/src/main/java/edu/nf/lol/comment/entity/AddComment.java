package edu.nf.lol.comment.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author Administrator
 * @date 2020/3/9
 */
@Data
public class AddComment {



    private Integer addComId;
    private Integer comId;
    private String addContent;
    private Date addDate;
}