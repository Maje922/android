package com.example.maje.ejercicio1.com.test.beans;

/**
 * Created by Gabi on 20/03/2018.
 */

public class PersonaUnica {
    private static final PersonaUnica ourInstance = new PersonaUnica();

    private String nombre;
    private DireccionDTO direccion;
    public static PersonaUnica getInstance() {
        return ourInstance;
    }

    private PersonaUnica() {
    }

    public static PersonaUnica getOurInstance() {
        return ourInstance;
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
