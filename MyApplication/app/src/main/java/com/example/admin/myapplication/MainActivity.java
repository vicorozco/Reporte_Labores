package com.example.admin.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
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


public class MainActivity extends AppCompatActivity  {


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

        cargarEncargados();

}

    @Override
    protected void onStart() {

        super.onStart();
        //StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();

        //StrictMode.setThreadPolicy(policy);
        final Spinner labores = (Spinner) findViewById(R.id.spinner_labores);
        // Spinner lotes = (Spinner) findViewById(R.id.spinner_lotes);
        lista_labores.add("Siembra");
        lista_labores.add("Control de plagas");
        lista_labores.add("Control de maleza");
        lista_labores.add("Enmiendas");
        lista_labores.add("Fertilización");
        ArrayAdapter<String> laboresAdapter = new ArrayAdapter<String>(this, simple_spinner_item,lista_labores);
        laboresAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        labores.setAdapter(laboresAdapter);
        Button button = (Button) findViewById(R.id.button);

         button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(labores.getSelectedItem().toString().equals("Enmiendas")) {
                    Intent enmienda = new Intent(getApplicationContext(), enmienda.class);
                    lista_labores.clear();
                    startActivity(enmienda);
                } else if(labores.getSelectedItem().toString().equals("Siembra")) {
                    Intent siembra = new Intent(getApplicationContext(), Siembra.class);
                    lista_labores.clear();
                    startActivity(siembra);
                } else if(labores.getSelectedItem().toString().equals("Control de plagas")){
                    Intent control_plagas = new Intent(getApplicationContext(), Control_Plagas.class);
                    lista_labores.clear();
                    startActivity(control_plagas);
                } else if(labores.getSelectedItem().toString().equals("Control de maleza")){
                    Intent control_maleza = new Intent(getApplicationContext(),control_malezas.class);
                    lista_labores.clear();
                    startActivity(control_maleza);
                } else if (labores.getSelectedItem().toString().equals("Fertilización")) {
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

    }

    }
