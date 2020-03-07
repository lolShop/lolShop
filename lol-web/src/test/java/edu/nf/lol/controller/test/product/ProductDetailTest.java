package edu.nf.lol.controller.test.product;


import edu.nf.lol.product.entity.Product;
import edu.nf.lol.product.service.ProductDetailService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;


/**
 * @author Crazy
 * @date 2020/3/5
 */

@SpringBootTest
public class ProductDetailTest {
    @Autowired
    private  ProductDetailService productDetailService;
    @Test
    public void testProductDetail(){
        Product product= new Product();
        product.setProductId(1);
        Product product1 = productDetailService.productDetail(product);
        System.out.println(product1.getProductName());
    }
}