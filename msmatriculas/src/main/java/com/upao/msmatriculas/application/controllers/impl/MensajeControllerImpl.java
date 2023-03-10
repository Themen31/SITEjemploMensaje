package com.upao.msmatriculas.application.controllers.impl;

import com.upao.msmatriculas.application.controllers.MensajeController;
import com.upao.msmatriculas.domain.entities.Mensaje;
import com.upao.msmatriculas.domain.services.impl.MensajeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MensajeControllerImpl implements MensajeController {

    @Autowired
    MensajeServiceImpl mensajeService;

    @Override
    public List<Mensaje> ListarTodos() {
        return mensajeService.ListarTodos();
    }

    @Override
    public boolean Registrar(Mensaje mensaje) {
        return mensajeService.Registrar(mensaje);
    }

    @Override
    public List<Mensaje> ListarxRemitente(String remitente) {
        return mensajeService.ListarxRemitente(remitente);
    }

    @Override
    public boolean Actualizar(Mensaje mensaje) {
        return mensajeService.Actualizar(mensaje);
    }

    @Override
    public boolean Eliminar(String remitente) {
        return mensajeService.Eliminar(remitente);
    }

}
