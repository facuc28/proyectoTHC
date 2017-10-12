package com.thcode.apirest.dominio;

public interface PersonaInt {

    int getId_Persona();
    String getNombre();
    String getApellido();
    String getTelefono();
    String getDireccion();
    String getDocumento();

    void setId_Persona(int id_persona);
    void setNombre(String nombre);
    void setApellido(String apellido);
    void setTelefono(String telefono);
    void setDireccion(String direccion);
    void setDocumento(String documento);
}
