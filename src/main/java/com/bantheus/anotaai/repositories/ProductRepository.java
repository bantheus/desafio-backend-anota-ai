package com.bantheus.anotaai.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.bantheus.anotaai.domain.product.Product;

@Repository
public interface ProductRepository extends MongoRepository<Product, String>{
  
}
