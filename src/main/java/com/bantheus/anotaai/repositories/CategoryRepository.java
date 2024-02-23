package com.bantheus.anotaai.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.bantheus.anotaai.domain.category.Category;

@Repository
public interface CategoryRepository extends MongoRepository<Category, String>{
  
}
