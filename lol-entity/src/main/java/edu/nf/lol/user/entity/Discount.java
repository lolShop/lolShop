package edu.nf.lol.user.entity;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author zhangch
 * @date 2020/3/8
 * 优惠券信息表
 */
@Data
public class Discount {

    private Integer disId;
    private Integer type;
    private BigDecimal money;
    private Integer loseDate;
    private Boolean useOrNot;
    private Boolean status;
}
