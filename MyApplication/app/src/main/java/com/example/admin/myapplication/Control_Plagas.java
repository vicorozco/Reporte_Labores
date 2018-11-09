package com.example.admin.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Control_Plagas extends AppCompatActivity {

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
    }
}
