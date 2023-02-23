package com.example.onlinestore.service.repository;

import com.example.onlinestore.dao.UserDao;
import com.example.onlinestore.entity.UserEntity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UserRepositoryService implements GeneralRepositoryService<Long, UserEntity> {
    private UserDao userDao;

    @Override
    @Transactional(rollbackFor = Throwable.class)
    public UserEntity findById(Long id) {
        Optional<UserEntity> userDaoById = userDao.findById(id);
        return userDaoById.orElseThrow(() -> new RuntimeException("user not found."));
    }

    @Override
    @Transactional(rollbackFor = Throwable.class)
    public List<UserEntity> findAll() {
        return userDao.findAll();
    }

    @Override
    @Transactional(rollbackFor = Throwable.class)
    public void deleteById(Long id) {
        userDao.deleteById(id);
    }

    @Override
    @Transactional(rollbackFor = Throwable.class)
    public UserEntity saveOrUpdate(UserEntity entity) {
        return userDao.save(entity);
    }

    @Override
    @Transactional(rollbackFor = Throwable.class)
    public Boolean existsById(Long id) {
        return userDao.existsById(id);
    }
}
