package com.example.demomongodb.service;

import com.example.demomongodb.model.Producto;
import com.example.demomongodb.repo.IProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServiceImpl implements IProductoService {

    @Autowired
    private IProductoRepository repository;

    @Override
    public List<Producto> findAll() {
        return repository.findAll();
    }

    @Override
    public Producto findById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Producto save(Producto producto) {
        return repository.save(producto);
    }

    @Override
    public Producto update(Producto producto) {
        return repository.save(producto);
    }

    @Override
    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
