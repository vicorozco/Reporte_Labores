package com.example.admin.myapplication;

public class Muestra {

    private String co_muest;
    private String de_muest;

    public Muestra(String co_muest, String de_muest) {
        this.co_muest = co_muest;
        this.de_muest = de_muest;
    }

    public String getCo_muest() {
        return co_muest;
    }

    public void setCo_muest(String co_muest) {
        this.co_muest = co_muest;
    }

    public String getDe_muest() {
        return de_muest;
    }

    public void setDe_muest(String de_muest) {
        this.de_muest = de_muest;
    }

    @Override
    public String toString() {
        return de_muest;
    }
}
