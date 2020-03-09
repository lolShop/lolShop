package edu.nf.lol;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Zachery
 * @date 2020/3/7
 */@SpringBootApplication
@MapperScan({"edu.nf.lol.comment.dao","edu.nf.lol.order.dao","edu.nf.lol.product.dao","edu.nf.lol.shopCart.dao","edu.nf.lol.user.dao"})
public class adminApplication {
    public static void main(String[] args) {
        SpringApplication.run(adminApplication.class,args);
    }
}
