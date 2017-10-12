package com.thcode.apirest.dominio.framework;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Setter
@Getter
public class Respuesta {

    private HttpStatus httpStatus;
    private Boolean exito;
    private Object datos;
    private Notificacion notificaciones;
}
