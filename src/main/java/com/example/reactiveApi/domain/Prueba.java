package com.example.reactiveApi.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Prueba {
    @Id
    private Integer id;

    private String name;

    private String address;
}
