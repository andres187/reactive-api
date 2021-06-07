package com.example.reactiveApi.controller;

import com.example.reactiveApi.domain.Prueba;
import com.example.reactiveApi.service.IServicio;
import com.example.reactiveApi.service.impl.ServicioImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/prueba")
public class Controlador {
    @Autowired
    private IServicio service;

    @PostMapping("/save")
    public Mono<Prueba> saveOneInvoice(@RequestBody Prueba prueba){
        return service.savePrueba(prueba);
        // for Mono<String>
        // service.saveInvoice(invoice);
        // return Mono.just("Invoice saved" + invoice.getId());
    }

    @GetMapping("/allPruebas")
    public Flux<Prueba> getAllInvoices(){
        return service.findAllPruebas();
    }

    @GetMapping("/get/{id}")
    public Mono<Prueba> getOneInvoice(@PathVariable Integer id){
        Mono<Prueba> invoice= service.getOnePrueba(id);
        return invoice;
    }

    @DeleteMapping("/delete/{id}")
    public Mono<String> deleteInvoice(@PathVariable Integer id){
        service.deletePrueba(id);
        return Mono.just("Prueba with id: " +id+ " deleted !");
    }
}
