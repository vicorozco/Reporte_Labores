package com.example.admin.myapplication;

import java.util.Date;

public class Cuadrilla {

    private String co_cuadrilla;
    private String de_cuadrilla;
    private String co_encargado;
    private String in_estado;
    private String co_usuario;
    private Date fe_modificacion;

    public Cuadrilla(String co_cuadrilla, String de_cuadrilla, String co_encargado, String in_estado, String co_usuario, Date fe_modificacion) {
        this.co_cuadrilla = co_cuadrilla;
        this.de_cuadrilla = de_cuadrilla;
        this.co_encargado = co_encargado;
        this.in_estado = in_estado;
        this.co_usuario = co_usuario;
        this.fe_modificacion = fe_modificacion;
    }

    public String getCo_cuadrilla() {
        return co_cuadrilla;
    }

    public void setCo_cuadrilla(String co_cuadrilla) {
        this.co_cuadrilla = co_cuadrilla;
    }

    public String getDe_cuadrilla() {
        return de_cuadrilla;
    }

    public void setDe_cuadrilla(String de_cuadrilla) {
        this.de_cuadrilla = de_cuadrilla;
    }

    public String getCo_encargado() {
        return co_encargado;
    }

    public void setCo_encargado(String co_encargado) {
        this.co_encargado = co_encargado;
    }

    public String getIn_estado() {
        return in_estado;
    }

    public void setIn_estado(String in_estado) {
        this.in_estado = in_estado;
    }

    public String getCo_usuario() {
        return co_usuario;
    }

    public void setCo_usuario(String co_usuario) {
        this.co_usuario = co_usuario;
    }

    public Date getFe_modificacion() {
        return fe_modificacion;
    }

    public void setFe_modificacion(Date fe_modificacion) {
        this.fe_modificacion = fe_modificacion;
    }

    @Override
    public String toString() {
       return de_cuadrilla;
    }

    public String showCuadrilla() {
        return "Cuadrilla{" +
                "co_cuadrilla='" + co_cuadrilla + '\'' +
                ", de_cuadrilla='" + de_cuadrilla + '\'' +
                ", co_encargado='" + co_encargado + '\'' +
                ", in_estado='" + in_estado + '\'' +
                ", co_usuario='" + co_usuario + '\'' +
                ", fe_modificacion=" + fe_modificacion +
                '}';
    }
}
