package edu.nf.lol.order.entity;

import lombok.Data;

/**
 * @author yangTao
 * @date 2020/3/9
 *退款原因表
 */
@Data
public class RefundReason {
    private Integer reasonId;   //id
    private String reasonValue;   //退款原因
}