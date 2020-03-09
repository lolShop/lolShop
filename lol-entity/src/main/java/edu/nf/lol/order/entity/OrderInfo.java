package edu.nf.lol.order.entity;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;


/**
 * @author yangTao
 * @date 2020/3/9
 * 订单信息表
 */
@Data
public class OrderInfo {
    private String orderId;   //订单id
    private Integer orderStaticId;    //订单状态id(关联订单状态表)
    private Integer addressId;    //收货信息id(关联收货信息表)
    private Integer userId;    //用户id(关联用户信息表)
    private BigDecimal preferentialAmount;    //优惠金额
    private BigDecimal paymentMoney;    //支付金额
    private Date orderTime;   //下单时间
    private Date paymentTime;   //支付时间
    private Date deliveryTime;   //发货时间
    private Date receivingTime;   //收货时间
}