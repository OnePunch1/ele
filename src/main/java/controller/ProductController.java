package controller;

import entity.Product;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.ProductService;

import javax.annotation.Resource;

@RestController
public class ProductController {

   @Resource(name = "productService")
    private ProductService productService;

    @RequestMapping("/get")
    public Product get(int id){
        id=1;
        return productService.getOne(id);
    }
}
