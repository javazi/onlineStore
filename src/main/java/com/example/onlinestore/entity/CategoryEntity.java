package com.example.onlinestore.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CategoryEntity extends BaseEntity{
    private String name;
    @OneToMany(mappedBy = "category", cascade = {CascadeType.PERSIST,CascadeType.DETACH,CascadeType.MERGE,
    CascadeType.REFRESH})
    @JsonBackReference
    private List<ProductEntity> productList;
}
