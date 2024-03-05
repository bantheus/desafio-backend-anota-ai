package com.bantheus.anotaai.services;

import org.springframework.stereotype.Service;

import com.bantheus.anotaai.domain.category.Category;
import com.bantheus.anotaai.domain.category.CategoryDTO;
import com.bantheus.anotaai.repositories.CategoryRepository;

@Service
public class CategoryService {
  private CategoryRepository repository;

  public CategoryService(CategoryRepository repository){
    this.repository = repository;
  }

  public Category createCategory(CategoryDTO categoryData){
    Category newCategory = new Category(categoryData);
    this.repository.save(newCategory);

    return newCategory;
  }
}
