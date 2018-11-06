package com.example.admin.myapplication;


public class Finca {

    private String co_finca;
    private String no_clien;
    private String de_finca;
    private int co_provin;
    private int co_canton;
    private int co_distri;
    private int co_caserio;
    private String ot_ubica;
    private int nu_area;
    private String te_finca;
    private String ot_email;
    private String co_zona;
    private String in_activa;
    private String co_supervisorp;

    public Finca(String co_finca, String no_clien, String de_finca, int co_provin, int co_canton, int co_distri, int co_caserio, String ot_ubica, int nu_area, String te_finca, String ot_email, String co_zona, String in_activa, String co_supervisorp) {
        this.co_finca = co_finca;
        this.no_clien = no_clien;
        this.de_finca = de_finca;
        this.co_provin = co_provin;
        this.co_canton = co_canton;
        this.co_distri = co_distri;
        this.co_caserio = co_caserio;
        this.ot_ubica = ot_ubica;
        this.nu_area = nu_area;
        this.te_finca = te_finca;
        this.ot_email = ot_email;
        this.co_zona = co_zona;
        this.in_activa = in_activa;
        this.co_supervisorp = co_supervisorp;
    }

    public void setCo_finca(String co_finca) {
        this.co_finca = co_finca;
    }

    public void setNo_clien(String no_clien) {
        this.no_clien = no_clien;
    }

    public void setDe_finca(String de_finca) {
        this.de_finca = de_finca;
    }

    public void setCo_provin(int co_provin) {
        this.co_provin = co_provin;
    }

    public void setCo_canton(int co_canton) {
        this.co_canton = co_canton;
    }

    public void setCo_distri(int co_distri) {
        this.co_distri = co_distri;
    }

    public void setCo_caserio(int co_caserio) {
        this.co_caserio = co_caserio;
    }

    public void setOt_ubica(String ot_ubica) {
        this.ot_ubica = ot_ubica;
    }

    public void setNu_area(int nu_area) {
        this.nu_area = nu_area;
    }

    public void setTe_finca(String te_finca) {
        this.te_finca = te_finca;
    }

    public void setOt_email(String ot_email) {
        this.ot_email = ot_email;
    }

    public void setCo_zona(String co_zona) {
        this.co_zona = co_zona;
    }

    public void setIn_activa(String in_activa) {
        this.in_activa = in_activa;
    }

    public void setCo_supervisorp(String co_supervisorp) {
        this.co_supervisorp = co_supervisorp;
    }


    public String getCo_finca() {
        return co_finca;
    }

    public String getNo_clien() {
        return no_clien;
    }

    public String getDe_finca() {
        return de_finca;
    }

    public int getCo_provin() {
        return co_provin;
    }

    public int getCo_canton() {
        return co_canton;
    }

    public int getCo_distri() {
        return co_distri;
    }

    public int getCo_caserio() {
        return co_caserio;
    }

    public String getOt_ubica() {
        return ot_ubica;
    }

    public int getNu_area() {
        return nu_area;
    }

    public String getTe_finca() {
        return te_finca;
    }

    public String getOt_email() {
        return ot_email;
    }

    public String getCo_zona() {
        return co_zona;
    }

    public String getIn_activa() {
        return in_activa;
    }

    public String getCo_supervisorp() {
        return co_supervisorp;
    }


public String toString() {
        return de_finca;
}


}
