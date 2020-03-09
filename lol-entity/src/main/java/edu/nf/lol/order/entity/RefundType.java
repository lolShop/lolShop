package edu.nf.lol.order.entity;

import lombok.Data;

/**
 * @author yangTao
 * @date 2020/3/9
 *退款类型表
 */
@Data
public class RefundType {
    private Integer reasonTypeId;     //id
    private String reasonTypeValue;    //退款类型
}