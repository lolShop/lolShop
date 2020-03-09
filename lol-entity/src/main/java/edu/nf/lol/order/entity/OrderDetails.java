package edu.nf.lol.order.entity;

import lombok.Data;

/**
 * @author yangTao
 * @date 2020/3/9
 * 订单详情
 */
@Data
public class OrderDetails {


    private Integer detailsId;  //订单明细id
    private String orderId;    //订单id(订单表)
    private Integer goodId;   	//商品id(关联商品表)
    private Integer goodNumber;	//商品数量
    private Integer specsId;	//商品规格id(关联商品规格表)

}