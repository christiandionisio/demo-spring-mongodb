package com.example.demomongodb.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "clientes")
@Data
@AllArgsConstructor
public class Cliente {

    @Id
    private String id;
    private String name;
    private String lastname;
    private String dni;

}
