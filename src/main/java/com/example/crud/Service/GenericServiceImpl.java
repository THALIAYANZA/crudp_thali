/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.crud.Service;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author THALY
 */
public abstract class GenericServiceImpl <T, ID extends Serializable> implements GenericService<T, ID> {
    
 public abstract CrudRepository<T, ID> getDao();

    @Override//traer los implements
    public T save(T entity) {
        return getDao().save(entity);
    }
    
     @Override//traer los implements
    public void delete(ID id) {
        getDao().deleteById(id);
    }

    @Override//traer los implements
    public List<T> findByAll() {
        List<T> list = new ArrayList<>();
        getDao().findAll().forEach(obj -> list.add(obj));
        return list;
    }

    @Override //traer los implements
    public T findById(ID id) {
        Optional<T> obj = getDao().findById(id);
        if (obj.isPresent()) {
            return obj.get();
        }
        return null;
    }
}
