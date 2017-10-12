package com.thcode.apirest.mappers;

import com.thcode.apirest.dominio.framework.Respuesta;
import com.thcode.apirest.dominio.framework.Solicitud;
import com.thcode.apirest.repositorios.ClienteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;

public class ClienteMapper {

    @Autowired
    private ClienteRepositorio clienteRepositorio;


    public Respuesta ejecutar(Solicitud solicitud) {
        return null;
    }
}
