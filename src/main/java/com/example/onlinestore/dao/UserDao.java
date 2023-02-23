package com.example.onlinestore.dao;

import com.example.onlinestore.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserDao extends JpaRepository<UserEntity, Long> {


}
