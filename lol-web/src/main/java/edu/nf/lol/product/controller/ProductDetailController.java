package edu.nf.lol.product.controller;

import edu.nf.lol.BaseController;
import edu.nf.lol.product.entity.Product;
import edu.nf.lol.product.service.ProductDetailService;
import edu.nf.lol.vo.ResponseVO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Crazy
 * @date 2020/3/5
 */
@RestController
@RequestMapping("product")
public class ProductDetailController extends BaseController {
    @Autowired
    private ProductDetailService service;

    /**
     * 在商品详细页面显示商品信息
     * @param product
     * @return
     */
    @GetMapping("/detail")
    public ResponseVO productDetail(Product product){
        Product product1 = service.productDetail(product);
        ResponseVO vo=success(product1);
        return  vo;
    }
}