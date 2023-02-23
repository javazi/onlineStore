package com.example.onlinestore.service.repository;

import java.io.Serializable;
import java.util.List;

public interface GeneralRepositoryService<L extends Serializable, E> {
    E findById(L id);
    List<E> findAll();
    void deleteById(L id);
    E saveOrUpdate(E entity);
    Boolean existsById(L id);
}
