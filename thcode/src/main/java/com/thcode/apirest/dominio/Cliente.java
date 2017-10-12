/*
 * Creado por Facundo Crusta 2017 @THCODE
 */
package com.thcode.apirest.dominio;

import com.thcode.apirest.dominio.framework.PersonaAbstracta;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "clientes")
public class Cliente extends PersonaAbstracta implements Serializable {

    //    private Contrato contrato;
    private String CUIL;
    private String CUIT;
//    private Propiedad propiedad;
//    private Pago pago;

    @Override
    public void setId_Persona(int id_persona) {

    }
}
