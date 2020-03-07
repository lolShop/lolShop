package edu.nf.lol.product.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author Crazy 这是商品类的实体
 * @date 2020/3/5
 */
@Data
public class Product {
    private  Integer   productId;
    private  Integer  productTypeId;
    private String    productName;
    private Date productCreateTime;
    private Date  productUpdateTime;
    private String  productMainImage;
    private String  productParticular;
    private  Integer   productWeight;
    private String productAttribute;
    private  Integer  productState	;
}