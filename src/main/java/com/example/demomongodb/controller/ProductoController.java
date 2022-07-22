package com.example.demomongodb.controller;

import com.example.demomongodb.model.Producto;
import com.example.demomongodb.service.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductoController {

    @Autowired
    private IProductoService service;

    @GetMapping
    public ResponseEntity<List<Producto>> findAll() {
        return ResponseEntity.ok().body(service.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Producto> findById(@PathVariable Integer id) {
        Producto productoBD = service.findById(id);

        if (productoBD == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok().body(productoBD);
    }

    @PostMapping
    public ResponseEntity<Producto> save(@RequestBody Producto producto) {
        Producto productoBD = service.save(producto);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}").buildAndExpand(productoBD.getId()).toUri();

        return ResponseEntity.created(location).build();
    }

    @PutMapping
    public ResponseEntity<Producto> update(@RequestBody Producto producto) {
        Producto productoBD = service.findById(producto.getId());

        if (productoBD == null) {
            return ResponseEntity.notFound().build();
        }

        Producto productoUpdated = service.update(producto);

        return ResponseEntity.ok().body(productoUpdated);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        Producto productoBD = service.findById(id);

        if (productoBD == null) {
            return ResponseEntity.notFound().build();
        }

        service.delete(id);

        return ResponseEntity.noContent().build();
    }


}
