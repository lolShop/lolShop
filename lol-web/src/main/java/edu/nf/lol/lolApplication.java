package edu.nf.lol;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Crazy
 * @date 2020/3/2
 */
@SpringBootApplication
@MapperScan({"edu.nf.lol.comment.dao","edu.nf.lol.order.dao","edu.nf.lol.product.dao","edu.nf.lol.shopCart.dao","edu.nf.lol.user.dao"})
public class lolApplication {
    public static void main(String[] args) {
        SpringApplication.run(lolApplication.class,args);
    }
}