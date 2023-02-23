package com.example.onlinestore.dao;

import com.example.onlinestore.entity.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryDao extends JpaRepository<CategoryEntity, Long> {

}
