package edu.nf.lol.order.entity;

import lombok.Data;

/**
 * @author yangTao
 * @date 2020/3/9
 *退款状态表
 */
@Data
public class RefundStatic {
    private Integer reasonStaticId;   //id
    private String reasonStaticValue;    //退款状态
}