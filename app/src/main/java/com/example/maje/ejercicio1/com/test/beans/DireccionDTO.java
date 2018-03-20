package com.example.maje.ejercicio1.com.test.beans;

/**
 * Created by Gabi on 15/03/2018.
 */

public class DireccionDTO {
    private String calle;
    private String cd;

    public DireccionDTO() {
    }

    public DireccionDTO(String calle, String cd) {
        this.calle = calle;
        this.cd = cd;
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
}
