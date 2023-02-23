package com.example.onlinestore.api;


import com.example.onlinestore.entity.CategoryEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

public interface CategoryApi {
final static String url = "/category";
    @PostMapping("/create")
    ResponseEntity<CategoryEntity> create
            (@RequestBody CategoryEntity category, @RequestHeader Map<String,String> header);

    @PutMapping("/update")
    ResponseEntity<CategoryEntity> update(@RequestBody CategoryEntity category);

    @DeleteMapping("/delete/{id}")
    ResponseEntity<String> delete(@PathVariable Long id);

    @GetMapping("/find/{id}")
    ResponseEntity<CategoryEntity> find(@PathVariable Long id);

    @GetMapping("/findAll")
    List<CategoryEntity> findAll();
}
