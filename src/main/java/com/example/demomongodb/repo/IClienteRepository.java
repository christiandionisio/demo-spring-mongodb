package com.example.demomongodb.repo;

import com.example.demomongodb.model.Cliente;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IClienteRepository extends MongoRepository<Cliente, String> {
}
