package com.upao.msmatriculas.domain.services;

import com.upao.msmatriculas.domain.entities.Mensaje;

import java.util.List;

public interface MensajeService {
    boolean Registrar(Mensaje mensaje);
    List<Mensaje> ListarTodos();

    List<Mensaje> ListarxRemitente(String remitente);

    boolean Actualizar(Mensaje mensaje);

    boolean Eliminar(String remitente);
}
