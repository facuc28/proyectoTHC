package com.thcode.apirest.controladores;

import com.thcode.apirest.dominio.Cliente;
import com.thcode.apirest.dominio.framework.Respuesta;
import com.thcode.apirest.repositorios.ClienteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteControlador {

    @Autowired
    ClienteRepositorio clienteRepositorio;
    Respuesta respuesta = new Respuesta();

    @RequestMapping(
            value = "/clientes",
            method = RequestMethod.GET,
            headers = {"Accept=application/json"})
    public ResponseEntity<Respuesta> getClientes() {



            Cliente cliente = new Cliente();
            cliente.setNombre("Facundo");
            cliente.setApellido("Crusta");
            cliente.setTelefono("3571457371");
            cliente.setDireccion("Obispo Trejo 1119 1C");
            clienteRepositorio.save(cliente);
            respuesta.setDatos(cliente);
            respuesta.setHttpStatus(HttpStatus.FOUND);
            respuesta.setExito(true);


        return new ResponseEntity<>(respuesta, HttpStatus.FOUND);
    }

}
