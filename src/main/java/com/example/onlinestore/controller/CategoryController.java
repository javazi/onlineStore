package com.example.onlinestore.controller;

import com.example.onlinestore.api.CategoryApi;
import com.example.onlinestore.business.CategoryBusiness;
import com.example.onlinestore.entity.CategoryEntity;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
@AllArgsConstructor
@RestController
@RequestMapping(CategoryApi.url)
@Slf4j
public class CategoryController implements CategoryApi {
    private CategoryBusiness categoryBusiness;

    @Override
    public ResponseEntity<CategoryEntity> create(CategoryEntity category, Map<String, String> header) {
        log.info("the create method was called with:{}",category);
        CategoryEntity createdCategory = categoryBusiness.create(category);
        log.info("the create method done with:{}",createdCategory);
        return new ResponseEntity<CategoryEntity>(createdCategory, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<CategoryEntity> update(CategoryEntity category) {
        CategoryEntity updatedCategory = categoryBusiness.update(category);
        return new ResponseEntity<CategoryEntity>(updatedCategory,HttpStatus.OK);
    }

    @Override
    public ResponseEntity<String> delete(Long id) {
        String deleteMessage = categoryBusiness.deleteById(id);
        return new ResponseEntity<String>(deleteMessage,HttpStatus.OK);
    }

    @Override
    public ResponseEntity<CategoryEntity> find(Long id) {
        CategoryEntity categoryBusinessById = categoryBusiness.findById(id);
        return new ResponseEntity<>(categoryBusinessById,HttpStatus.OK);
    }

    @Override
    public List<CategoryEntity> findAll() {
        List<CategoryEntity> allCategories = categoryBusiness.findAll();
        return allCategories;
    }
}
