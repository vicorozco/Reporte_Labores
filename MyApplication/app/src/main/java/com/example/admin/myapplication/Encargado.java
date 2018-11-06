package com.example.admin.myapplication;

public class Encargado {

    private String co_supervisor;
    private String de_nombre;
    private String in_tipo;

    public Encargado(String co_supervisor, String de_nombre, String in_tipo) {
        this.co_supervisor = co_supervisor;
        this.de_nombre = de_nombre;
        this.in_tipo = in_tipo;
    }

    public String getCo_supervisor() {
        return co_supervisor;
    }

    public void setCo_supervisor(String co_supervisor) {
        this.co_supervisor = co_supervisor;
    }

    public String getDe_nombre() {
        return de_nombre;
    }

    public void setDe_nombre(String de_nombre) {
        this.de_nombre = de_nombre;
    }

    public String getIn_tipo() {
        return in_tipo;
    }

    public void setIn_tipo(String in_tipo) {
        this.in_tipo = in_tipo;
    }


    @Override
    public String toString() {
        return "Encargado{" +
                "co_supervisor='" + co_supervisor + '\'' +
                ", de_nombre='" + de_nombre + '\'' +
                ", in_tipo='" + in_tipo + '\'' +
                '}';
    }
}
