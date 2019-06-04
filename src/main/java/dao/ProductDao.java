package dao;

import entity.Product;

import java.util.List;
import java.util.Map;

public interface ProductDao {
   Product getProduct(int storeId);
   List<Product> getAllProduct(int storeId);
   List<Product> getSortPrice(Map map);
}
