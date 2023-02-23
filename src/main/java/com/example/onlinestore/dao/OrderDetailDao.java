package com.example.onlinestore.dao;

import com.example.onlinestore.entity.OrderDetailEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailDao extends JpaRepository<OrderDetailEntity, Long> {
}
