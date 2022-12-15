package com.upao.msmatriculas.domain.repositories;

import com.upao.msmatriculas.domain.entities.Mensaje;

import javax.swing.*;
import java.util.List;

public interface MensajeRepository {
    boolean Registrar(Mensaje mensaje);
    List<Mensaje> ListarTodos();

    List<Mensaje> ListarxRemitente(String remitente);

    boolean Actualizar(Mensaje mensaje);

    boolean Eliminar(String remitente);
}
