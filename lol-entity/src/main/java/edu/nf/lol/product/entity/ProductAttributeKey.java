package edu.nf.lol.product.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author Crazy
 * @date 2020/3/9
 */
@Data
public class ProductAttributeKey {
    private  Integer  AttributeValueId;
    private  String   AttributeKeyName;
    private Date  AttributeCreateTime;
    private Date      AttributeUpdateTime;
    private  ProductType productType;
}