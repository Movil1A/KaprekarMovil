package com.example.kaprekar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Constante extends AppCompatActivity {

    Button btnEjemplo, btnCalcular;
    EditText etMultiLine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_constante);

        btnEjemplo = findViewById(R.id.btnEjemplo);
        btnCalcular = findViewById(R.id.btnCalcular);
        etMultiLine= findViewById(R.id.etMultiLine);

        etMultiLine.setText("El matemático indio Dattatreya Ramchandra Kaprekar descubrió en 1949 una curiosa característica de número 6174. Hoy se conoce a dicho número como constante de kaprekar en honor a él.\n" +
                "El número es notable por la siguiente propiedad:\n" +
                "Elige un número de cuatro dígitos que tenga al menos dos diferentes (es válido colocar el número 0 al principio, por lo que el número 0009 es válido).\n" +
                " Coloca sus dígitos en orden ascendente y en orden descendente para formar dos nuevos números. Puedes añadir los dígitos 0 que necesites al principio.\n" +
                "Resta el menor al mayor.\n" +
                "Vuelve al paso 2.\n" +
                "A este proceso se le conoce como rutina de kaprekar, y siempre llegara al número 6174 en, como mucho, 7 iteraciones.\n" +
                "Una vez en él, el proceso no avanzara, dado que 7641 – 1467 = 6174");

        btnEjemplo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Ejemplo.class);
                startActivity(intent);
            }
        });

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(getApplicationContext(), Calcular.class);
                startActivity(intent2);
            }
        });

    }
}