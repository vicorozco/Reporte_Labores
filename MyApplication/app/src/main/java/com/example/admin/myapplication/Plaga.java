package com.example.admin.myapplication;

import java.util.Date;

public class Plaga {

    private String co_perio;
    private String co_finca;
    private String no_clien;
    private String co_lote;
    private String co_cultiv;
    private String co_variedad;
    private Date fe_cplaga;
    private String co_enferm;
    private String co_muest;
    private String in_necon;
    private String in_contro;
    private String in_resul;
    private int ca_prese;
    private String ot_obser;
    private String no_boleta;
    private String co_usuario;
    private Date fe_creacion;

    public Plaga(String co_perio, String co_finca, String no_clien, String co_lote, String co_cultiv, String co_variedad, Date fe_cplaga, String co_enferm, String co_muest, String in_necon, String in_contro, String in_resul, int ca_prese, String ot_obser, String no_boleta, String co_usuario, Date fe_creacion) {
        this.co_perio = co_perio;
        this.co_finca = co_finca;
        this.no_clien = no_clien;
        this.co_lote = co_lote;
        this.co_cultiv = co_cultiv;
        this.co_variedad = co_variedad;
        this.fe_cplaga = fe_cplaga;
        this.co_enferm = co_enferm;
        this.co_muest = co_muest;
        this.in_necon = in_necon;
        this.in_contro = in_contro;
        this.in_resul = in_resul;
        this.ca_prese = ca_prese;
        this.ot_obser = ot_obser;
        this.no_boleta = no_boleta;
        this.co_usuario = co_usuario;
        this.fe_creacion = fe_creacion;
    }

    public Plaga(String co_perio, String co_finca, String no_clien, String co_lote, String co_cultiv, String co_variedad, Date fe_cplaga, String co_enferm, String co_muest, String in_necon, String in_contro, String in_resul, int ca_prese) {
        this.co_perio = co_perio;
        this.co_finca = co_finca;
        this.no_clien = no_clien;
        this.co_lote = co_lote;
        this.co_cultiv = co_cultiv;
        this.co_variedad = co_variedad;
        this.fe_cplaga = fe_cplaga;
        this.co_enferm = co_enferm;
        this.co_muest = co_muest;
        this.in_necon = in_necon;
        this.in_contro = in_contro;
        this.in_resul = in_resul;
        this.ca_prese = ca_prese;
    }

    public String getCo_perio() {
        return co_perio;
    }

    public void setCo_perio(String co_perio) {
        this.co_perio = co_perio;
    }

    public String getCo_finca() {
        return co_finca;
    }

    public void setCo_finca(String co_finca) {
        this.co_finca = co_finca;
    }

    public String getNo_clien() {
        return no_clien;
    }

    public void setNo_clien(String no_clien) {
        this.no_clien = no_clien;
    }

    public String getCo_lote() {
        return co_lote;
    }

    public void setCo_lote(String co_lote) {
        this.co_lote = co_lote;
    }

    public String getCo_cultiv() {
        return co_cultiv;
    }

    public void setCo_cultiv(String co_cultiv) {
        this.co_cultiv = co_cultiv;
    }

    public String getCo_variedad() {
        return co_variedad;
    }

    public void setCo_variedad(String co_variedad) {
        this.co_variedad = co_variedad;
    }

    public Date getFe_cplaga() {
        return fe_cplaga;
    }

    public void setFe_cplaga(Date fe_cplaga) {
        this.fe_cplaga = fe_cplaga;
    }

    public String getCo_enferm() {
        return co_enferm;
    }

    public void setCo_enferm(String co_enferm) {
        this.co_enferm = co_enferm;
    }

    public String getCo_muest() {
        return co_muest;
    }

    public void setCo_muest(String co_muest) {
        this.co_muest = co_muest;
    }

    public String getIn_necon() {
        return in_necon;
    }

    public void setIn_necon(String in_necon) {
        this.in_necon = in_necon;
    }

    public String getIn_contro() {
        return in_contro;
    }

    public void setIn_contro(String in_contro) {
        this.in_contro = in_contro;
    }

    public String getIn_resul() {
        return in_resul;
    }

    public void setIn_resul(String in_resul) {
        this.in_resul = in_resul;
    }

    public int getCa_prese() {
        return ca_prese;
    }

    public void setCa_prese(int ca_prese) {
        this.ca_prese = ca_prese;
    }

    public String getOt_obser() {
        return ot_obser;
    }

    public void setOt_obser(String ot_obser) {
        this.ot_obser = ot_obser;
    }

    public String getNo_boleta() {
        return no_boleta;
    }

    public void setNo_boleta(String no_boleta) {
        this.no_boleta = no_boleta;
    }

    public String getCo_usuario() {
        return co_usuario;
    }

    public void setCo_usuario(String co_usuario) {
        this.co_usuario = co_usuario;
    }

    public Date getFe_creacion() {
        return fe_creacion;
    }

    public void setFe_creacion(Date fe_creacion) {
        this.fe_creacion = fe_creacion;
    }

    @Override
    public String toString() {
        return "Plaga{" +
                "co_perio='" + co_perio + '\'' +
                ", co_finca='" + co_finca + '\'' +
                ", no_clien='" + no_clien + '\'' +
                ", co_lote='" + co_lote + '\'' +
                ", co_cultiv='" + co_cultiv + '\'' +
                ", co_variedad='" + co_variedad + '\'' +
                ", fe_cplaga=" + fe_cplaga +
                ", co_enferm='" + co_enferm + '\'' +
                ", co_muest='" + co_muest + '\'' +
                ", in_necon='" + in_necon + '\'' +
                ", in_contro='" + in_contro + '\'' +
                ", in_resul='" + in_resul + '\'' +
                ", ca_prese=" + ca_prese +
                ", ot_obser='" + ot_obser + '\'' +
                ", no_boleta='" + no_boleta + '\'' +
                ", co_usuario='" + co_usuario + '\'' +
                ", fe_creacion=" + fe_creacion +
                '}';
    }
}
