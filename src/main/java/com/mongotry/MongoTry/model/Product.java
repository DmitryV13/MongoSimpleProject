package com.mongotry.MongoTry.model;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document("product")
public class Product {
    @org.springframework.data.annotation.Id
    private String id;
    @Field(name="name")
    private String nameProduct;
    @Field(name="category")
    private String categoryProduct;
    
    
    public Product(String id, String nameProduct, String categoryProduct) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.categoryProduct = categoryProduct;
    }
    
    public Product() {
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public void setName(String name) {
        this.nameProduct = name;
    }
    
    public void setCategory(String category) {
        this.categoryProduct = category;
    }
    
    public String getId() {
        return id;
    }
    
    public String getName() {
        return nameProduct;
    }
    public String getCategory() {
        return categoryProduct;
    }
}
