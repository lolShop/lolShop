package edu.nf.lol.product.entity;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author Crazy
 * @date 2020/3/9
 */
@Data
public class ProductSpecs {
    private  Integer  specsId;
    private  String productSpecs;
    private     BigDecimal   specsPrice;
    private    Integer specsStock;
    private Date  specsCreateTime;
    private  Date  specsUpdateTime;
    private  Integer   specsState;
    private  Product product;
}