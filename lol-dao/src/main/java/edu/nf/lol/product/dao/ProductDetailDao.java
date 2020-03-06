package edu.nf.lol.product.dao;

import edu.nf.lol.product.entity.Product;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

/**
 * @author Crazy  这是遍历商品详细页面的Dao
 * @date 2020/3/5
 */
@Repository
public interface ProductDetailDao {
    /**
     * 这是根据商品Id查询,单个商品的信息,在商品详细页显示
     * @param product
     * @return
     */
      Product productDetail(Product product);
}