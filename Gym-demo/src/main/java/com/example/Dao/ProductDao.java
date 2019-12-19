package com.example.Dao;

import com.example.entity.Product;
import com.example.entity.ProductExample;

import java.util.List;

public interface ProductDao {
    public List<Product>  SelectAllProduct();
    public boolean DeleteProduct(int productId);
    public boolean UpdateProduct(Product product);
    public boolean InsertProduct(Product product);
    public List<Product> SelectProduct(ProductExample productExample);
    public Product SelectBykey(int productId);
    public List<String> SelectProductType();
}
