package com.example.onlinestore.service.repository;

import com.example.onlinestore.dao.OrderDao;
import com.example.onlinestore.entity.OrderEntity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class OrderRepositoryService implements GeneralRepositoryService<Long, OrderEntity> {
    private OrderDao orderDao;

    @Override
    @Transactional(rollbackFor = Throwable.class)
    public OrderEntity findById(Long id) {
        Optional<OrderEntity> orderDaoById = orderDao.findById(id);
        return orderDaoById.orElseThrow(()->new RuntimeException("Order not found."));
    }

    @Override
    @Transactional(rollbackFor = Throwable.class)
    public List<OrderEntity> findAll() {
        return orderDao.findAll();
    }

    @Override
    @Transactional(rollbackFor = Throwable.class)
    public void deleteById(Long id) {
    orderDao.deleteById(id);
    }

    @Override
    @Transactional(rollbackFor = Throwable.class)
    public OrderEntity saveOrUpdate(OrderEntity entity) {
        return orderDao.save(entity);
    }

    @Override
    @Transactional(rollbackFor = Throwable.class)
    public Boolean existsById(Long id) {
        return orderDao.existsById(id);
    }
}
