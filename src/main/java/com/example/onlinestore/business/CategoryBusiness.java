package com.example.onlinestore.business;

import com.example.onlinestore.entity.CategoryEntity;
import com.example.onlinestore.exception.CategoryNotFoundException;
import com.example.onlinestore.exception.NullException;
import com.example.onlinestore.service.repository.CategoryRepositoryService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
//@NoArgsConstructor
public class CategoryBusiness {
   // @Autowired
    private CategoryRepositoryService categoryRepositoryService;

    public CategoryEntity create(CategoryEntity categoryEntity){
        return categoryRepositoryService.saveOrUpdate(categoryEntity);
    }

    public CategoryEntity update(CategoryEntity categoryEntity){
        Long id = categoryEntity.getId();
        if(id>0){
            if(categoryRepositoryService.existsById(id)){
                return categoryRepositoryService.saveOrUpdate(categoryEntity);
            }else throw new CategoryNotFoundException("id is not correct.");
        }
        else
           throw  new NullException("id is null.");
    }

    public String deleteById(Long id){
        if (categoryRepositoryService.existsById(id)){
            categoryRepositoryService.deleteById(id);
            return "The category with id= " + id + " was successfully deleted.";
        }else
            throw new CategoryNotFoundException("id = " + id + " dose not exist.");
    }

    public CategoryEntity findById(Long id){
        if (categoryRepositoryService.existsById(id)){
            return categoryRepositoryService.findById(id);
        }else
        throw new CategoryNotFoundException("id = " + id + " dose not exist.");
    }

    public List<CategoryEntity> findAll(){
        return categoryRepositoryService.findAll();
    }
}
