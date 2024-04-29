package com.mongotry.MongoTry.service;

import com.mongotry.MongoTry.model.Product;
import com.mongotry.MongoTry.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    public final ProductRepository productRepository;
    public ProductService(ProductRepository productRepository){
        this.productRepository=productRepository;
    }
    public void addProduct(Product product){
        productRepository.insert(product);
    }
    public void updateProduct(Product product){
        Product current = productRepository.findById(product.getId())
                .orElseThrow(()->new RuntimeException(String.format("Error with product with Id %s", product.getId())));
        
        current.setName(product.getName());
        current.setCategory(product.getCategory());
        
        productRepository.save(current);
    }
    public void deleteProduct(String Id){
        productRepository.deleteById(Id);
    }
    public List<Product> getAllProducts(){
        var t = productRepository.findAll();
        return productRepository.findAll();
    }
    public void getProductByName(){
    
    }
}
