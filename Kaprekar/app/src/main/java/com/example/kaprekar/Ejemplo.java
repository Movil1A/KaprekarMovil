package com.example.kaprekar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Ejemplo extends AppCompatActivity {

    Button btnRegresar2;
    EditText txtEjemplo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejemplo);

        btnRegresar2 = findViewById(R.id.btnRegresar2);
        txtEjemplo = findViewById(R.id.txtEjemplo);

        txtEjemplo.setText("Por ejemplo el número 1893 alcanzara a la constante de kaprekar en 7 iteraciones:\n" +
                "9831 - 1389 = 8442\n" +
                "8442 - 2448 = 5994\n" +
                "9954 - 4599 = 5355\n" +
                "5553 -3555 = 1998\n" +
                "9981 - 1899 = 8082\n" +
                "8820 - 0288 = 8532\n" +
                "8532 - 2358 = 6174");

        btnRegresar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inte = new Intent(getApplicationContext(), Constante.class);
                startActivity(inte);
            }
        });

    }
}