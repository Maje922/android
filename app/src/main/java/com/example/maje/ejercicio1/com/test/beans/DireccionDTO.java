package com.example.maje.ejercicio1.com.test.beans;

/**
 * Created by Gabi on 15/03/2018.
 */

import java.io.Serializable;


public class DireccionDTO implements Serializable{
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DireccionDTO that = (DireccionDTO) o;

        if (calle != null ? !calle.equals(that.calle) : that.calle != null) return false;
        return cd != null ? cd.equals(that.cd) : that.cd == null;
    }

    @Override
    public int hashCode() {
        int result = calle != null ? calle.hashCode() : 0;
        result = 31 * result + (cd != null ? cd.hashCode() : 0);
        return result;
    }
}
