package edu.nf.lol.product.entity;

import lombok.Data;

import java.sql.Time;
import java.util.Date;

/**
 * @author Crazy
 * @date 2020/3/9
 */
@Data
public class ProductAttributeValue {
    private  Integer  attributeValueId;
    private  Integer attributeKeyId;
    private  String attributeValueName;
    private Date attribute_create_time;
    private Date attribute_update_Time;
    private  ProductAttributeKey productAttributeKey;
}