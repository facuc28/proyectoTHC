package com.thcode.apirest.dominio.framework;

import com.thcode.apirest.dominio.Persona;
import com.thcode.apirest.dominio.PersonaInt;
import lombok.Setter;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
@Setter
public abstract class PersonaAbstracta implements PersonaInt {
    @Id
    private int id_persona;
    private String nombre;
    private String apellido;
    private String telefono;
    private String direccion;
    private String documento;
    private Persona persona;

    @Override
    public int getId_Persona() {
        return id_persona;
    }
    @Override
    public String getNombre() {
        return nombre;
    }
    @Override
    public String getApellido() {
        return apellido;
    }
    @Override
    public String getTelefono() {
        return telefono;
    }
    @Override
    public String getDireccion(){
        return direccion;
    }
    @Override
    public String getDocumento() {
        return documento;
    }

}
