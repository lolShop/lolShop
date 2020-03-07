package edu.nf.lol.product.service.impl;

import edu.nf.lol.product.dao.ProductDetailDao;
import edu.nf.lol.product.entity.Product;
import edu.nf.lol.product.service.ProductDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Crazy
 * @date 2020/3/5
 */
@Service("productDetailService")
@Transactional
public class ProductDetailServiceImpl implements ProductDetailService {
    @Autowired
    private ProductDetailDao productDetailDao;
    @Override
    public Product productDetail(Product product) {
        return  productDetailDao.productDetail(product);
    }
}