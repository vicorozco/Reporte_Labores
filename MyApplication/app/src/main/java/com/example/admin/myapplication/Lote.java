package com.example.admin.myapplication;

public class Lote {

    private String co_finca;
    private String no_clien;
    private String co_lote;
    private String de_lote;
    private int nu_area;
    private String co_arincl;


    public Lote(String co_finca, String no_clien, String co_lote, String de_lote, int nu_area, String co_arincl) {
        this.co_finca = co_finca;
        this.no_clien = no_clien;
        this.co_lote = co_lote;
        this.de_lote = de_lote;
        this.nu_area = nu_area;
        this.co_arincl = co_arincl;
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

    public String getDe_lote() {
        return de_lote;
    }

    public void setDe_lote(String de_lote) {
        this.de_lote = de_lote;
    }

    public int getNu_area() {
        return nu_area;
    }

    public void setNu_area(int nu_area) {
        this.nu_area = nu_area;
    }

    public String getCo_arincl() {
        return co_arincl;
    }

    public void setCo_arincl(String co_arincl) {
        this.co_arincl = co_arincl;
    }

    public String toString(){
        return de_lote;
    }
}
