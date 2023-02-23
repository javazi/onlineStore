package com.example.onlinestore.service.repository;

import com.example.onlinestore.dao.OrderDetailDao;
import com.example.onlinestore.entity.OrderDetailEntity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class OrderDetailRepositoryService implements GeneralRepositoryService<Long, OrderDetailEntity> {
   private OrderDetailDao orderDetailDao;

    @Override
    @Transactional(rollbackFor = Throwable.class)
    public OrderDetailEntity findById(Long id) {
        Optional<OrderDetailEntity> orderDetailDaoById = orderDetailDao.findById(id);
        return orderDetailDaoById.orElseThrow(()-> new RuntimeException("OrderDetail not found."));
    }

    @Override
    @Transactional(rollbackFor = Throwable.class)
    public List<OrderDetailEntity> findAll() {
        return orderDetailDao.findAll();
    }

    @Override
    @Transactional(rollbackFor = Throwable.class)
    public void deleteById(Long id) {
    orderDetailDao.deleteById(id);
    }

    @Override
    @Transactional(rollbackFor = Throwable.class)
    public OrderDetailEntity saveOrUpdate(OrderDetailEntity entity) {
        return orderDetailDao.save(entity);
    }

    @Override
    @Transactional(rollbackFor = Throwable.class)
    public Boolean existsById(Long id) {
        return orderDetailDao.existsById(id);
    }
}
