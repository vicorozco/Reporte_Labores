package com.example.admin.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Productos_Plagas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_productos__plagas);
        Button add = (Button) findViewById(R.id.add);
        Button button = (Button) findViewById(R.id.button);

        add.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //Guardar datos de las plagas aquí
                finish();
                Intent agregar_Productos = new Intent(getApplicationContext(),Productos_Plagas.class);
                startActivity(agregar_Productos);
            }
        });

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //Guardar datos de las plagas aquí
                finish();
                Intent agregar_trabajadores = new Intent(getApplicationContext(), Trabajadores.class);
                startActivity(agregar_trabajadores);
            }
        });
    }
}
