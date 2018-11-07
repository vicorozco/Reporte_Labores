package com.example.admin.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.TextView;

import static android.R.layout.simple_spinner_item;


public class MainActivity extends AppCompatActivity {


    private static final String ODBC_DRIVER = "oracle.jdbc.driver.OracleDriver";
    private static final String URL = "jdbc:oracle:thin:agric";
    private static final String USER_NAME = "agric";
    private static final String USER_PASS = "agric";
    private List<Lote> lista_lotes;
    private List<Finca> lista_fincas;
    private List<Cuadrilla> lista_cuadrillas;
    private List<String> lista_labores = new ArrayList<>() ;

    final String[] co_clien = {null};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println("Antes XE");
        Spinner fincas = (Spinner) findViewById(R.id.spinner_fincas);


        Conexion conexion = new Conexion("10.11.2.1","firevic", USER_NAME, USER_PASS);
        System.out.println("Antes2 XE");


       // Conexion conexion = new Conexion("10.11.2.1", "firevic", USER_NAME, USER_PASS);
           try {
               System.out.println("ddd");
               lista_fincas = conexion.obtener_fincas();
           } catch (SQLException e) {
               e.printStackTrace();
          }

          System.out.println("LLLL" + lista_fincas);
          ArrayAdapter<Finca> dataAdapter;
             dataAdapter = new ArrayAdapter<Finca>(this, simple_spinner_item, (List<Finca>) lista_fincas);
             dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
             fincas.setAdapter(dataAdapter);

        try {
            conexion.CerrarConexion();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        cargarEncargados();

}

    @Override
    protected void onStart() {

        super.onStart();
        //StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();

        //StrictMode.setThreadPolicy(policy);
        final Spinner labores = (Spinner) findViewById(R.id.spinner_labores);
        // Spinner lotes = (Spinner) findViewById(R.id.spinner_lotes);
        Conexion conexion = new Conexion("10.11.2.1","firevic", USER_NAME,USER_PASS);
        try {
            lista_labores = conexion.obtener_labores();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        lista_labores.add("CONTROL MALEZAS");
        lista_labores.add("ENMIENDA");
        ArrayAdapter<String> laboresAdapter = new ArrayAdapter<String>(this, simple_spinner_item,lista_labores);
        laboresAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        labores.setAdapter(laboresAdapter);
        Button button = (Button) findViewById(R.id.button);
        try {
            conexion.CerrarConexion();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(labores.getSelectedItem().toString().equals("ENMIENDA")) {
                    Intent enmienda = new Intent(getApplicationContext(), enmienda.class);
                    lista_labores.clear();
                    startActivity(enmienda);
                } else if(labores.getSelectedItem().toString().equals("SIEMBRA")) {
                    Intent siembra = new Intent(getApplicationContext(), Siembra.class);
                    lista_labores.clear();
                    startActivity(siembra);
                } else if(labores.getSelectedItem().toString().equals("CONTROL PLAGAS")){
                    Intent control_plagas = new Intent(getApplicationContext(), Control_Plagas.class);
                    lista_labores.clear();
                    startActivity(control_plagas);
                } else if(labores.getSelectedItem().toString().equals("CONTROL MALEZAS")){
                    Intent control_maleza = new Intent(getApplicationContext(),control_malezas.class);
                    lista_labores.clear();
                    startActivity(control_maleza);
                } else if (labores.getSelectedItem().toString().equals("FERTILIZACION")) {
                    Intent fertilizacion = new Intent(getApplicationContext(), fertlizacion.class);
                    lista_labores.clear();
                    startActivity(fertilizacion);
                }

            }
        });
    }



    public void cargarEncargados() {
        Spinner encargados = (Spinner) findViewById(R.id.spinner_encargados);
        System.out.println("enargados");
        Conexion conexion = new Conexion("10.11.2.1","firevic", USER_NAME,USER_PASS);
        try {
            System.out.println("ddd");
            lista_cuadrillas = conexion.obtener_cuadrillas();
        } catch (SQLException e) {
            e.printStackTrace();
        }


        ArrayAdapter<Cuadrilla> dataAdapter;
        dataAdapter = new ArrayAdapter<Cuadrilla>(this, simple_spinner_item, (List<Cuadrilla>) lista_cuadrillas);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        encargados.setAdapter(dataAdapter);
        try {
            conexion.CerrarConexion();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public class AsynTask extends AsyncTask {
        @Override
        protected Object doInBackground(Object[] objects) {
            return null;
        }
    }

}

