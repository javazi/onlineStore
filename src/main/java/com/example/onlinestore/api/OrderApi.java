package com.example.onlinestore.api;

import com.example.onlinestore.entity.OrderEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


public interface OrderApi {
    public static final String url = "/order";

    @PostMapping("/create")
    ResponseEntity<OrderEntity> create(@RequestBody OrderEntity order);

    @PutMapping("/update")
    ResponseEntity<OrderEntity> update(@RequestBody OrderEntity order);

    @DeleteMapping("/delete/{id}")
    ResponseEntity<String> delete(@PathVariable Long id);

    @GetMapping("/find/{id}")
    ResponseEntity<OrderEntity> find(@PathVariable Long id);

    @GetMapping("/findAll")
    ResponseEntity<List<OrderEntity>> findAll();
}
