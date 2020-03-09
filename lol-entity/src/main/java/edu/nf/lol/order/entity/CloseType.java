package edu.nf.lol.order.entity;

import lombok.Data;

/**
 * @author yangTao
 * @date 2020/3/9
 * 订单关闭类型表
 */
@Data
public class CloseType {
    private Integer closeTypeId;  //类型id
    private String closeTypeValue;   //订单关闭类型
}