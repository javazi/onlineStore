package com.example.onlinestore.dao;

import com.example.onlinestore.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDao extends JpaRepository<ProductEntity, Long> {
}
