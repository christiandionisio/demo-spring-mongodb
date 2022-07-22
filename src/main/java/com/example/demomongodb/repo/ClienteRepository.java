package com.example.demomongodb.repo;

import com.example.demomongodb.entity.Cliente;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ClienteRepository extends MongoRepository<Cliente, String> {
}
