package edu.nf.lol.user.entity;

import lombok.Data;

/**
 * @author zhangch
 * @date 2020/3/8
 * 用户拥有的优惠券信息
 */
@Data
public class UserDiscount {

    private User user;
    private Discount discount;
}
