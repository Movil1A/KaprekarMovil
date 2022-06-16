package com.example.kaprekar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Ejemplo extends AppCompatActivity {

    Button btnRegresar2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejemplo);

        btnRegresar2 = findViewById(R.id.btnRegresar2);



        btnRegresar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inte = new Intent(getApplicationContext(), Constante.class);
                startActivity(inte);
            }
        });

    }
}