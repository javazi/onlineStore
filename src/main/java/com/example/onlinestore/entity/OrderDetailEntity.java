package com.example.onlinestore.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class OrderDetailEntity extends BaseEntity{
    @OneToOne
    private ProductEntity product;
    private Integer amount;
    @ManyToOne
    private OrderEntity order;
}
