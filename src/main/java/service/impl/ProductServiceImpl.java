package service.impl;

import dao.ProductDao;
import entity.Product;
import org.springframework.stereotype.Service;
import service.ProductService;

import javax.annotation.Resource;

@Service("productService")
public class ProductServiceImpl implements ProductService {
    @Resource(name = "productDao")
    private ProductDao productDao;


    public Product getOne(int id) {
        return productDao.getProduct(id);
    }
}
