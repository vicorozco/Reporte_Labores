package com.example.admin.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static android.R.layout.simple_spinner_item;

public class Control_Plagas extends AppCompatActivity {
    private static final String ODBC_DRIVER = "oracle.jdbc.driver.OracleDriver";
    private static final String URL = "jdbc:oracle:thin:agric";
    private static final String USER_NAME = "agric";
    private static final String USER_PASS = "agric";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_control__plagas);
        Button button = (Button) findViewById(R.id.button);
        Button add = (Button) findViewById(R.id.add);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
            Intent productos = new Intent(getApplicationContext(),Productos_Plagas.class);
            startActivity(productos);
            }
        });

        add.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //Guardar datos de las plagas aquí
              finish();
              Intent agregar_Plagas = new Intent(getApplicationContext(),Control_Plagas.class);
              startActivity(agregar_Plagas);
            }
        });
        setTipoControl();
        setResultado();
        setMuestra();
        setPlaga();
    }


    private void setTipoControl() {
        Spinner tipoControl1 = (Spinner) findViewById(R.id.spinner_control);
        Spinner tipoControl2 = (Spinner) findViewById(R.id.spinner_control2);
        List<String> tiposcontrol = new ArrayList<>();
        tiposcontrol.add("BIOLÓGICO");
        tiposcontrol.add("QUÍMICO");
        tiposcontrol.add("CULTURAL");

        ArrayAdapter<String> controles = new ArrayAdapter<String>(this, simple_spinner_item,tiposcontrol);
        controles.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        tipoControl1.setAdapter(controles);
        tipoControl2.setAdapter(controles);
    }

    private void setResultado() {
        Spinner resultado = (Spinner) findViewById(R.id.spinner_resultado);
        Spinner resultado2 = (Spinner) findViewById(R.id.spinner_resultado2);
        List<String> resultados = new ArrayList<>();
        resultados.add("BUENO");
        resultados.add("MALO");
        resultados.add("REGULAR");

        ArrayAdapter<String> adapterResultados = new ArrayAdapter<String>(this,simple_spinner_item, resultados);
        adapterResultados.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        resultado.setAdapter(adapterResultados);
        resultado2.setAdapter(adapterResultados);
    }

    private void setMuestra() {
        Spinner muestra1 = (Spinner) findViewById(R.id.spinner_muestra);
        Spinner muestra2 = (Spinner) findViewById(R.id.spinner_muestra2);
        Conexion conexion = new Conexion("10.11.2.1","firevic", USER_NAME,USER_PASS);
        List<Muestra> muestras = new ArrayList<>();
        try {
            muestras = conexion.obtener_muestras();
            ArrayAdapter<Muestra> adapterMuestras = new ArrayAdapter<Muestra>(this, simple_spinner_item, muestras);
            adapterMuestras.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            muestra1.setAdapter(adapterMuestras);
            muestra2.setAdapter(adapterMuestras);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            conexion.CerrarConexion();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void setPlaga() {
        Spinner plaga1 = (Spinner) findViewById(R.id.spinner_plagas);
        Spinner plaga2 = (Spinner) findViewById(R.id.spinner_plagas2);
        Conexion conexion = new Conexion("10.11.2.1","firevic", USER_NAME,USER_PASS);
        List<Enfermedad> plagas = new ArrayList<>();
        try {
            plagas = conexion.obtener_plagas();
            ArrayAdapter<Enfermedad> adapterPlagas = new ArrayAdapter<Enfermedad>(this, simple_spinner_item, plagas);
            adapterPlagas.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            plaga1.setAdapter(adapterPlagas);
            plaga2.setAdapter(adapterPlagas);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            conexion.CerrarConexion();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
