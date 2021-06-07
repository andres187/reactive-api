package com.example.reactiveApi.repository;

import com.example.reactiveApi.domain.Prueba;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface IRepositorio extends ReactiveMongoRepository<Prueba, Integer> {
}
