package com.bantheus.anotaai.controllers;

import java.net.URI;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bantheus.anotaai.domain.category.Category;
import com.bantheus.anotaai.domain.category.CategoryDTO;
import com.bantheus.anotaai.services.CategoryService;

@RestController
@RequestMapping("/api/category")
public class CategoryController {

  private CategoryService service;

  public CategoryController(CategoryService service){
    this.service = service;
  }
  
  @PostMapping
  public ResponseEntity<Category> createCategory(@RequestBody CategoryDTO categoryData){
    Category newCategory = this.service.createCategory(categoryData);

    URI location = URI.create(String.format("/api/category/%s", newCategory.getId()));

    return ResponseEntity.created(location).body(newCategory);
  }
}
