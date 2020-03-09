package edu.nf.lol.comment.entity;

import lombok.Data;

/**
 * @author Administrator
 * @date 2020/3/9
 */
@Data
public class ContentReport {
    private Integer reportId;
    private Integer comId;
    private String reportName;
    private Integer reasonId;
}