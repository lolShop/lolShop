package edu.nf.lol.product.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author Crazy
 * @date 2020/3/9
 */
@Data
public class ProductImage {
    private  Integer  imageId;
    private  String     imageName;
    private Date AttributeCreateTime;
    private  Date AttributeUpdateTime;
    private  Product product;
}