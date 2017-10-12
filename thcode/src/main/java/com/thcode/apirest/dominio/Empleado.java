package com.thcode.apirest.dominio;

//Clase
public class Empleado {

    //Atributos
    private String nombre = null;
    private String apellido = null;
    private int telefono = 0;

    //Getters
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getTelefono() {
        return telefono;
    }

    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    //Constructores
    public Empleado() {

    }
    public Empleado(String nombre, String apellido, int telefono) {
       this.nombre = nombre;
       this.apellido = apellido;
       this.telefono = telefono;
    }
}
