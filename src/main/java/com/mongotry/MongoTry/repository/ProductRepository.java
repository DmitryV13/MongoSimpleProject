package com.mongotry.MongoTry.repository;

import com.mongotry.MongoTry.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
