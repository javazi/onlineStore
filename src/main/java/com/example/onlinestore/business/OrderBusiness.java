package com.example.onlinestore.business;

import com.example.onlinestore.entity.OrderEntity;
import com.example.onlinestore.service.repository.OrderRepositoryService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor

public class OrderBusiness {
    public OrderRepositoryService orderRepositoryService;

    /*public ResponseEntity<OrderEntity> findById(Long id){
        OrderEntity orderEntity = orderRepositoryService.findById(id);
        return new ResponseEntity<> ;
    }*/

}
