package edu.nf.lol.user.entity;

import lombok.Data;

/**
 * @author zhangch
 * @date 2020/3/8
 * 收货地址
 */
@Data
public class Address {
    private Integer addressId;
    private User user;
    private String takeName;
    private String takePhone;
    private String takeAddress;
    private String postcode;
    private Boolean status;
}
