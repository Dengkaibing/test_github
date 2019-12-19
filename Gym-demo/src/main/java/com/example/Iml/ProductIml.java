package com.example.Iml;

import com.example.Dao.ProductDao;
import com.example.entity.Product;
import com.example.entity.ProductExample;
import com.example.respository.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class ProductIml implements ProductDao {
    @Autowired
    private ProductMapper productMapper;
    @Override
    public List<Product> SelectAllProduct() {
        ProductExample productExample=new ProductExample();
        List<Product> productList=productMapper.selectByExample(productExample);
        return productList;
    }

    @Override
    public boolean DeleteProduct(int productId) {
        int i=productMapper.deleteByPrimaryKey(productId);
        return i!=0?true:false;
    }

    @Override
    public boolean UpdateProduct(Product product) {
        int i=productMapper.updateByPrimaryKeySelective(product);
        return i!=0?true:false;
    }

    @Override
    public boolean InsertProduct(Product product) {
        int i=productMapper.insertSelective(product);
        return i!=0?true:false;
    }

    @Override
    public List<Product> SelectProduct(ProductExample productExample) {
        List<Product> productList=productMapper.selectByExample(productExample);
        return productList;
    }

    @Override
    public Product SelectBykey(int productId) {
         Product product=productMapper.selectByPrimaryKey(productId);
         return product;
    }

    @Override
    public List<String> SelectProductType() {
        List<String> stringList=productMapper.SelectProductType();
        return stringList;
    }
}
