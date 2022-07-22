package com.example.demomongodb.repo;

import com.example.demomongodb.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductoRepository extends JpaRepository<Producto, Integer> {

}
