package com.thcode.apirest.dominio.framework;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Notificacion {

    private Boolean contenido;
    private List<ErrorFormulario> erroresDeFormulario;
    private List<ErrorDeCampo> erroresDeCampo;
}
