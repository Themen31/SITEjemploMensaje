package com.upao.msmatriculas.application.controllers;

import com.upao.msmatriculas.domain.entities.Mensaje;
import org.springframework.boot.ApplicationArguments;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(path = "/mensajes")
public interface MensajeController {

    @GetMapping(produces = "application/json")
    List<Mensaje> ListarTodos();

    @PostMapping(produces = "application/json", consumes = "application/json")
    boolean Registrar(@RequestBody Mensaje mensaje);

    @GetMapping(value = "/remitente/{codigo}")
    List<Mensaje> ListarxRemitente(@PathVariable String codigo);

    @PutMapping(value = "/mensajes", consumes = {"application/json"})
    boolean Actualizar(@RequestBody Mensaje mensaje);

    @DeleteMapping(value = "/mensajes/{remitente}")
    boolean Eliminar(@PathVariable("remitente") String remitente);
}
