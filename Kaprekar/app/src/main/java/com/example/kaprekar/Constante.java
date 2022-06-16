package com.example.kaprekar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Constante extends AppCompatActivity {

    Button btnEjemplo, btnCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_constante);

        btnEjemplo = findViewById(R.id.btnEjemplo);
        btnCalcular = findViewById(R.id.btnCalcular);

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