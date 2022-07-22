package com.example.demomongodb.service;

import com.example.demomongodb.model.Producto;

import java.util.List;

public interface IProductoService {
    List<Producto> findAll();
    Producto findById(Integer id);
    Producto save(Producto producto);
    Producto update(Producto producto);
    void delete(Integer id);
}
