package com.example.onlinestore.service.repository;

import com.example.onlinestore.dao.CategoryDao;
import com.example.onlinestore.entity.CategoryEntity;
import com.example.onlinestore.exception.CategoryNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class CategoryRepositoryService implements GeneralRepositoryService<Long, CategoryEntity> {
    private CategoryDao categoryDao;

    @Override
    @Transactional(rollbackFor = Throwable.class)
    public CategoryEntity findById(Long id) {
        Optional<CategoryEntity> categoryDaoById = categoryDao.findById(id);
        return categoryDaoById.orElseThrow(()-> new CategoryNotFoundException("category not found."));
    }

    @Override
    @Transactional(rollbackFor = Throwable.class)
    public List<CategoryEntity> findAll() {
        return categoryDao.findAll();
    }

    @Override
    @Transactional(rollbackFor = Throwable.class)
    public void deleteById(Long id) {
    categoryDao.deleteById(id);
    }

    @Override
    @Transactional(rollbackFor = Throwable.class)
    public CategoryEntity saveOrUpdate(CategoryEntity entity) {
        return categoryDao.save(entity);
    }

    @Transactional(rollbackFor = Throwable.class)
    @Override
    public Boolean existsById(Long id){
        return categoryDao.existsById(id);
    }
}
