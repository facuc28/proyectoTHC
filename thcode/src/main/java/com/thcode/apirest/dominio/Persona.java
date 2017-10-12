package com.thcode.apirest.dominio;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;
import org.apache.cxf.annotations.DataBinding;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@JsonInclude(JsonInclude.Include.NON_NULL)
@Table(name = "personas")
public class Persona implements Serializable {
    @JsonIgnore
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id_persona;
    private String nombre;
    private String apellido;
    private String telefono;
    private String direccion;
    private String documento;

}
