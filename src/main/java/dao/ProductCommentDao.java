package dao;

import entity.Product;

import java.util.List;
import java.util.Map;

public interface ProductCommentDao {
    List<Product> getSortMark(int storeId);
    List<Map<String,Object>> getComment(int storeId);
}
