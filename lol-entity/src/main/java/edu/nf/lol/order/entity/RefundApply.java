package edu.nf.lol.order.entity;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author yangTao
 * @date 2020/3/9
 * 退款信息表
 */
@Data
public class RefundApply {
    private Integer refund_id;  //id
    private Integer userId;    //用户id(关联用户)
    private Integer reasonId;  //关联退款原因表
    private String refundExplain; //退款申请说明
    private String voucherImage;  //退款申请图片
    private String orderId;     //订单id（订单表）
    private Integer detailsId;     //订单明细id(订单明细表)
    private Integer reasonSum;  //退款数量（不能超过购买数量）
    private Integer reasonTypeId;   //退款类型id(退款类型表)
    private BigDecimal reasonPrice;     //退款金额(小于商品金额)
    private Integer ReasonStaticId;    //关联退款状态表
}