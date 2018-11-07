package com.example.admin.myapplication;

public class Labor {

    private String co_labor;
    private String de_labor;

    public Labor(String co_labor, String de_labor) {
        this.co_labor = co_labor;
        this.de_labor = de_labor;
    }

    public String getCo_labor() {
        return co_labor;
    }

    public void setCo_labor(String co_labor) {
        this.co_labor = co_labor;
    }

    public String getDe_labor() {
        return de_labor;
    }

    public void setDe_labor(String de_labor) {
        this.de_labor = de_labor;
    }

    @Override
    public String toString() {
        return de_labor;
    }
}

