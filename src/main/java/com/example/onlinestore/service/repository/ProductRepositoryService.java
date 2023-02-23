package com.example.onlinestore.service.repository;

import com.example.onlinestore.dao.ProductDao;
import com.example.onlinestore.entity.ProductEntity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ProductRepositoryService implements GeneralRepositoryService<Long, ProductEntity> {
    private ProductDao productDao;

    @Override
    @Transactional(rollbackFor = Throwable.class)
    public ProductEntity findById(Long id) {
        Optional<ProductEntity> productDaoById = productDao.findById(id);
        return productDaoById.orElseThrow(()->new RuntimeException("Product not found"));
    }

    @Override
    @Transactional(rollbackFor = Throwable.class)
    public List<ProductEntity> findAll() {
        return productDao.findAll();
    }

    @Override
    @Transactional(rollbackFor = Throwable.class)
    public void deleteById(Long id) {
    productDao.deleteById(id);
    }

    @Override
    @Transactional(rollbackFor = Throwable.class)
    public ProductEntity saveOrUpdate(ProductEntity entity) {
        return productDao.save(entity);
    }

    @Override
    @Transactional(rollbackFor = Throwable.class)
    public Boolean existsById(Long id) {
        return productDao.existsById(id);
    }
}
