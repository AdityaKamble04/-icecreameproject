package com.demo.ServiceImpl;

import java.util.List;
import com.demo.Entity.product;
import com.demo.Service.productService;
import com.demo.dao.productdao;



public class productServiceImpl implements productService {

    private productdao productDao = null;

    
    public void ProductServiceImpl(productdao productDao) {
        this.productDao = productDao;
    }

    @Override
    public void saveProduct(product product) {
        // Business logic can be added here
        productDao.saveProduct(product);
    }

    @Override
    public product getProduct(String brand) {
        // Business logic can be added here
        return productDao.getProduct(brand);
    }

    @Override
    public void updateProduct(product product) {
        // Business logic can be added here
        productDao.updateProduct(product);
    }

    @Override
    public void deleteProduct(String brand) {
        // Business logic can be added here
        productDao.deleteProduct(brand);
    }

    @Override
    public List<product> getAllProducts() {
        // Business logic can be added here
        return productDao.getAllProducts();
    }
}
