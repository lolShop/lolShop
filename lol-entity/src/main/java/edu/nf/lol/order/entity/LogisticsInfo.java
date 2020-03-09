package edu.nf.lol.order.entity;

import lombok.Data;

/**
 * @author yangTao
 * @date 2020/3/9
 *物流公司表
 */
@Data
public class LogisticsInfo {
    private Integer logId; //物流公司id
    private String logName;    //物流公司名称
}