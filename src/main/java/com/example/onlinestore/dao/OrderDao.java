package com.example.onlinestore.dao;

import com.example.onlinestore.entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDao extends JpaRepository<OrderEntity, Long> {
}
