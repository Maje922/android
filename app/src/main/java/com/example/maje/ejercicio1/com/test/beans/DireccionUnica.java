package com.example.maje.ejercicio1.com.test.beans;

/**
 * Created by Gabi on 20/03/2018.
 */

public class DireccionUnica {
    private String calle;
    private String cd;
    private static final DireccionUnica ourInstance = new DireccionUnica();

    public static DireccionUnica getInstance() {
        return ourInstance;
    }

    private DireccionUnica() {
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCd() {
        return cd;
    }

    public void setCd(String cd) {
        this.cd = cd;
    }

    public static DireccionUnica getOurInstance() {
        return ourInstance;
    }
}
