package com.example.demomongodb.service;

import com.example.demomongodb.model.Cliente;

import java.util.List;

public interface IClienteService {

    List<Cliente> findAll();
    Cliente save(Cliente cliente);
    void delete(String id);

}
