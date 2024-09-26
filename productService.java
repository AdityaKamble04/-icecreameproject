package com.demo.Service;

import java.util.List;
import com.demo.Entity.product;

public interface productService {

    void saveProduct(product product);
    
    product getProduct(String brand);
    
    void updateProduct(product product);
    
    void deleteProduct(String brand);
    
    List<product> getAllProducts();
}