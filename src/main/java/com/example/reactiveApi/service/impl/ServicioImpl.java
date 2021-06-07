package com.example.reactiveApi.service.impl;

import com.example.reactiveApi.domain.Prueba;
import com.example.reactiveApi.repository.IRepositorio;
import com.example.reactiveApi.service.IServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ServicioImpl implements IServicio {
    @Autowired
    private IRepositorio repositorio;

    @Override
    public Mono<Prueba> savePrueba(Prueba prueba) {
        return repositorio.save(prueba);
    }

    @Override
    public Flux<Prueba> findAllPruebas() {
        return repositorio.findAll()
                .switchIfEmpty(Flux.empty());
    }

    @Override
    public Mono<Prueba> getOnePrueba(Integer id) {
        return repositorio.findById(id);
    }

    @Override
    public Mono<Void> deletePrueba(Integer id) {
        return repositorio.deleteById(id);
    }
}
