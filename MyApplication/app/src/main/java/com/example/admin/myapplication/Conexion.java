package com.example.admin.myapplication;

import android.os.StrictMode;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Conexion {
    public String driver, url, ip, bd, usr, pass;
    public Connection conexion;

    public Conexion(String ip, String bd, String usr, String pass) {
        driver = "oracle.jdbc.driver.OracleDriver";

        this.bd = bd;
        this.usr = usr;
        this.pass = pass;

        url = "jdbc:oracle:thin:@" + ip + ":1522:" + bd;

        try {
            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();

            StrictMode.setThreadPolicy(policy);

            Class.forName(driver);
            conexion = DriverManager.getConnection(url, usr, pass);
            System.out.println("Conexion a Base de Datos " + bd + " Exitosa conexion" + conexion.toString());

        } catch (Exception exc) {
            System.out.println("Error al tratar de abrir la base de Datos "
                    + bd + " : " + exc);
        }
    }


    public void prueba() throws SQLException {
        Statement stmt = null;
        String query = "select * from all_all_tables";

        try {
            stmt = conexion.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        while (rs.next()) {
            String nombre = rs.getString("TABLE_NAME");
            System.out.println("nombre " + nombre);

        }
    }


    public List<Finca> obtener_fincas() throws SQLException {
       List<Finca> fincas = new ArrayList<>();
        Statement stmt = null;
        String query = "select * from agm_finca where no_clien <=720000 and no_clien >=500000  and in_activa='S' order by no_clien ASC NULLS LAST";

        try {

            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();

            StrictMode.setThreadPolicy(policy);
            stmt = conexion.createStatement();
            ResultSet rs = null;

            rs = stmt.executeQuery(query);

            while (rs.next()) {
                fincas.add(new Finca(rs.getString("CO_FINCA"),rs.getString("NO_CLIEN"),rs.getString("DE_FINCA"),
                        rs.getInt("CO_PROVIN"),rs.getInt("CO_CANTON"),rs.getInt("CO_DISTRI"),rs.getInt("CO_CASERI"),
                        rs.getString("OT_UBICA"),rs.getInt("NU_AREA"),rs.getString("TE_FINCA"),rs.getString("OT_EMAIL"),
                        rs.getString("CO_ZONA"),rs.getString("IN_ACTIVA"),rs.getString("CO_SUPERVISORP")));
                }

        } catch (SQLException e) {

            e.printStackTrace();

        }
        return fincas;
    }


    public List<Lote> obtener_lotes(String co_clien) throws SQLException {
        List<Lote> lotes = new ArrayList<>();
        Statement stmt = null;
        String query = "select * from agm_lotes where no_clien =" + co_clien;


        try {

            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();

            StrictMode.setThreadPolicy(policy);
            stmt = conexion.createStatement();
            ResultSet rs = null;

            rs = stmt.executeQuery(query);

            while (rs.next()) {
                lotes.add(new Lote(rs.getString("CO_FINCA"),rs.getString("NO_CLIEN"),rs.getString("CO_LOTE"),
                       rs.getString("DE_LOTE"),rs.getInt("NU_AREA"),rs.getString("CO_ARINCL")));
            }

        } catch (SQLException e) {

            e.printStackTrace();

        }
        return lotes;
    }

    public List<Cuadrilla> obtener_cuadrillas() throws SQLException {
        List<Cuadrilla> cuadrillas = new ArrayList<>();
        Statement stmt = null;
        String query = "select * from agmcuadrillas";


        try {

            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();

            StrictMode.setThreadPolicy(policy);
            stmt = conexion.createStatement();
            ResultSet rs = null;

            rs = stmt.executeQuery(query);

            while (rs.next()) {
                cuadrillas.add(new Cuadrilla(rs.getString("CO_CUADRILLA"),rs.getString("DE_CUADRILLA"),rs.getString("CO_ENCARGADO"),
                        rs.getString("IN_ESTADO"),rs.getString("CO_USUARIO"),rs.getDate("FE_MODIFICACION")));
            }

        } catch (SQLException e) {

            e.printStackTrace();

        }
        return cuadrillas;
    }
    public List<String> obtener_labores() throws SQLException {
        List<String> labores = new ArrayList<>();
        Statement stmt = null;
        String query = "select * from agm_tlabo";


        try {

            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();

            StrictMode.setThreadPolicy(policy);
            stmt = conexion.createStatement();
            ResultSet rs = null;

            rs = stmt.executeQuery(query);

            while (rs.next()) {
                labores.add(rs.getString("DE_LABOR"));
            }

        } catch (SQLException e) {

            e.printStackTrace();

        }
        return labores;
    }

    public Connection getConexion() {
        return conexion;
    }

    public Connection CerrarConexion() throws SQLException {
        conexion.close();
        conexion = null;
        return conexion;
    }
}


