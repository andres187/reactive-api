package com.example.reactiveApi.service;

import com.example.reactiveApi.domain.Prueba;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IServicio {

    public Mono<Prueba> savePrueba(Prueba prueba);

    public Flux<Prueba> findAllPruebas();

    public Mono<Prueba> getOnePrueba(Integer id);

    public Mono<Void> deletePrueba(Integer id);
}
