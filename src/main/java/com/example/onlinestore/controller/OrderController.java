package com.example.onlinestore.controller;

import com.example.onlinestore.api.OrderApi;
import com.example.onlinestore.entity.OrderEntity;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@AllArgsConstructor
@RequestMapping(OrderApi.url)

public class OrderController implements OrderApi {

    @Override
    public ResponseEntity<OrderEntity> create(OrderEntity order) {
        return null;
    }

    @Override
    public ResponseEntity<OrderEntity> update(OrderEntity order) {
        return null;
    }

    @Override
    public ResponseEntity<String> delete(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<OrderEntity> find(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<List<OrderEntity>> findAll() {
        return null;
    }
}
