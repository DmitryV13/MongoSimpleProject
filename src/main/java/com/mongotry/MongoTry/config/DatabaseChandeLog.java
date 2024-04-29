package com.mongotry.MongoTry.config;

import com.github.cloudyrock.mongock.ChangeLog;
import com.github.cloudyrock.mongock.ChangeSet;
import com.mongotry.MongoTry.model.Product;
import com.mongotry.MongoTry.repository.ProductRepository;

import java.util.ArrayList;
import java.util.List;

@ChangeLog
public class DatabaseChandeLog {
    @ChangeSet(order = "001", id="seedDatabase", author="Oushi")
    public void seedDatabase(ProductRepository productRepository){
        List<Product> productList = new ArrayList<>();
        productList.add(createNewProduct("pen", "school"));
        productList.add(createNewProduct("pencil", "school"));
        productList.add(createNewProduct("book", "school"));
        
        productRepository.insert(productList);
    }
    
    private Product createNewProduct(String name, String category){
        Product tmp = new Product();
        tmp.setName(name);
        tmp.setCategory(category);
        return tmp;
    }
}
