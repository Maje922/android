package com.example.maje.ejercicio1.com.test.beans;

/**
 * Created by Maje on 15/03/2018.
 */

public class PersonaDTO {
    private String nombre;
    private DireccionDTO direccion;

    public PersonaDTO() {
    }

    public PersonaDTO(String nombre, DireccionDTO direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public DireccionDTO getDireccion() {
        return direccion;
    }

    public void setDireccion(DireccionDTO direccion) {
        this.direccion = direccion;
    }

}
