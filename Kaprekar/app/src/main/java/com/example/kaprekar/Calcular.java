package com.example.kaprekar;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.sax.Element;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class Calcular extends AppCompatActivity {

    Button btnRegresar,btnLimpiar,btnRutinaKaprekar;
    EditText etNumero, etIteracion, etLista;
    Metodos metodos = new Metodos();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calcular);

        btnRegresar = findViewById(R.id.btnRegresar2);
        btnRutinaKaprekar = findViewById(R.id.btnRutinaKaprekar);
        btnLimpiar = findViewById(R.id.btnLimpiar);
        etNumero = findViewById(R.id.etNumero);
        etIteracion = findViewById(R.id.etIteacion);
        etLista = findViewById(R.id.etLista);
        
        btnRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Constante.class);
                startActivity(intent);
            }
        });

        btnRutinaKaprekar.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.N)
            @Override
            public void onClick(View view) {

                try {
                    String numero = etNumero.getText().toString();

                    ArrayList<String> listado = metodos.kaprekarMostrar(numero);
                    int iteracion = metodos.getCount();

                    etIteracion.append(Integer.toString(iteracion));

                    for (int i=0; i<listado.stream().count();i++)
                    {
                        etLista.append(listado.get(i));
                    }
                }catch (Exception ex){

                }
            }
        });

        btnLimpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etIteracion.setText("");
                etNumero.setText("");
                etLista.setText("");
            }
        });
    }
}