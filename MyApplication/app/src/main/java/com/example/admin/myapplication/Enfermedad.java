package com.example.admin.myapplication;

public class Enfermedad {

    private String co_enferm;
    private String de_enferm;
    private String in_enferm;
    private String de_comun;
    private String co_cultivo;

    public Enfermedad(String co_enferm, String de_enferm, String in_enferm, String de_comun, String co_cultivo) {
        this.co_enferm = co_enferm;
        this.de_enferm = de_enferm;
        this.in_enferm = in_enferm;
        this.de_comun = de_comun;
        this.co_cultivo = co_cultivo;
    }

    public String getCo_enferm() {
        return co_enferm;
    }

    public void setCo_enferm(String co_enferm) {
        this.co_enferm = co_enferm;
    }

    public String getDe_enferm() {
        return de_enferm;
    }

    public void setDe_enferm(String de_enferm) {
        this.de_enferm = de_enferm;
    }

    public String getIn_enferm() {
        return in_enferm;
    }

    public void setIn_enferm(String in_enferm) {
        this.in_enferm = in_enferm;
    }

    public String getDe_comun() {
        return de_comun;
    }

    public void setDe_comun(String de_comun) {
        this.de_comun = de_comun;
    }

    public String getCo_cultivo() {
        return co_cultivo;
    }

    public void setCo_cultivo(String co_cultivo) {
        this.co_cultivo = co_cultivo;
    }

    @Override
    public String toString() {
        return de_comun;
    }
}
