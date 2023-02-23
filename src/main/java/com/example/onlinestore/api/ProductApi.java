package com.example.onlinestore.api;

import com.example.onlinestore.entity.ProductEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface ProductApi {
    static final String url = "/product";

    @PostMapping("/create")
    ResponseEntity<ProductEntity> create(@RequestBody ProductEntity product);

    @PutMapping("/update")
    ResponseEntity<ProductEntity> update(@RequestBody ProductEntity product);

    @DeleteMapping("/delete/{id}")
    ResponseEntity<String> delete(@PathVariable Long id);

    @GetMapping("/find/{id}")
    ResponseEntity<ProductEntity> find(@PathVariable Long id);

    @GetMapping("/findAll")
    ResponseEntity<List<ProductEntity>> findAll();

}
