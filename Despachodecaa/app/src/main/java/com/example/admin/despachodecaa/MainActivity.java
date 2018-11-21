package com.example.admin.despachodecaa;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                EditText msj = (EditText)findViewById(R.id.cortador1);
                enviarEmail(msj.getText().toString());
            }

        });
        numCarretas();

    }

    /**
     * Metodo que permite enviar un correo con la informacion del despacho de caña
     *
     * @param mensaje
     */
    public void  enviarEmail(String mensaje){

        Intent emailIntent = new Intent(Intent.ACTION_SEND);

        emailIntent.setData(Uri.parse("mailto:"));
        emailIntent.setType("text/plain");
        emailIntent.putExtra(Intent.EXTRA_EMAIL, "vicaror201195@gmail.com"); // * configurar email aquí!
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Tu Asunto...");
        emailIntent.putExtra(Intent.EXTRA_TEXT, mensaje);

        try {
            startActivity(Intent.createChooser(emailIntent, "Enviar email."));
            Log.i("EMAIL", "Enviando email...");
        }
        catch (android.content.ActivityNotFoundException e) {
            Toast.makeText(this, "NO existe ningún cliente de email instalado!.", Toast.LENGTH_SHORT).show();
        }

    }

    /**
     * Método para agregar los números de carreras en los spinner
     */
    private void numCarretas() {
        Spinner numCarreta1 = (Spinner) findViewById(R.id.spinner1);
        Spinner numCarreta2 = (Spinner) findViewById(R.id.spinner2);
        Spinner numCarreta3 = (Spinner) findViewById(R.id.spinner3);
        Spinner numCarreta4 = (Spinner) findViewById(R.id.spinner4);
        Spinner numCarreta5 = (Spinner) findViewById(R.id.spinner5);

        List<Integer> numCarretas = new ArrayList<>();
        numCarretas.add(1);
        numCarretas.add(2);
        numCarretas.add(3);
        numCarretas.add(4);
        numCarretas.add(5);

        ArrayAdapter<Integer> adapter = new ArrayAdapter<Integer>(this,android.R.layout.simple_spinner_item, (List<Integer>) numCarretas);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        numCarreta1.setAdapter(adapter);
        numCarreta2.setAdapter(adapter);
        numCarreta3.setAdapter(adapter);
        numCarreta4.setAdapter(adapter);
        numCarreta5.setAdapter(adapter);
    }


}
