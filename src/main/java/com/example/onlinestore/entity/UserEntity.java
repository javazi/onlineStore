package com.example.onlinestore.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class UserEntity extends BaseEntity{
    private String name;
    @OneToMany(mappedBy = "user")
    private List<OrderEntity> orderList;
}
