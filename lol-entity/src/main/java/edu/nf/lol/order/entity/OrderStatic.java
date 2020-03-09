package edu.nf.lol.order.entity;

import lombok.Data;

/**
 * @author yangTao
 * @date 2020/3/9
 *订单状态表
 */
@Data
public class OrderStatic {
    private int staticId ;	//订单状态id
    private String staticName;//订单状态名称
}