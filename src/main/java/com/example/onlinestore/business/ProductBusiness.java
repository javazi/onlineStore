package com.example.onlinestore.business;

import com.example.onlinestore.entity.ProductEntity;
import com.example.onlinestore.exception.NullException;
import com.example.onlinestore.exception.ProductNotFoundException;
import com.example.onlinestore.service.repository.ProductRepositoryService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class ProductBusiness {
    private ProductRepositoryService productRepositoryService;

    public ProductEntity create(ProductEntity product){
        ProductEntity productEntity = productRepositoryService.saveOrUpdate(product);
        return productEntity;
    }

    public ProductEntity update(ProductEntity product){
        long id = product.getId();
        if (id>0)
        {
            if (productRepositoryService.existsById(id))
              return  productRepositoryService.saveOrUpdate(product);
            else
                throw new ProductNotFoundException("id is not correct.");
        }else
            throw new NullException("id is null.");
    }

    public String deleteById(Long id){
        if (productRepositoryService.existsById(id)){
            productRepositoryService.deleteById(id);
            return "The Product with id= " + id + " was successfully deleted.";
        }else
            throw new ProductNotFoundException("id = " + id + " dose not exist.");
    }

    public ProductEntity findById(Long id){
        if (productRepositoryService.existsById(id)){
            return productRepositoryService.findById(id);
        }else
            throw new ProductNotFoundException("id = " + id + " dose not exist.");
    }

    public List<ProductEntity> findAll(){
        return productRepositoryService.findAll();
    }
}
