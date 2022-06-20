package com.example.kaprekar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button btnIngresar;
    FileOutputStream fos;
    File f;
    final String A = "usuarios.txt";
    ArrayList<String> list = new ArrayList<>();
    EditText etUsuario, etPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        btnIngresar = findViewById(R.id.btnIngresar);
        etUsuario = findViewById(R.id.etUsuario);
        etPassword = findViewById(R.id.etPassword);


        btnIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    if(Verificar()){
                        Intent intent = new Intent(getApplicationContext(), Constante.class);
                        startActivity(intent);
                    }else {
                        Toast.makeText(MainActivity.this, "Datos nvalidos", Toast.LENGTH_SHORT).show();
                    }
                }catch (Exception ex){
                    Toast.makeText(MainActivity.this, "Error inesperado", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    public boolean Verificar() throws Exception {
        f = getFileStreamPath(A);
        if(!f.exists()){
            fos = openFileOutput(A, Context.MODE_PRIVATE);
            fos.close();
            fos = openFileOutput(A,Context.MODE_APPEND);
            fos.write("admin-admin\n".getBytes(StandardCharsets.UTF_8));
            fos.flush();
            fos.close();
        }
        InputStreamReader reader = new InputStreamReader(openFileInput(A));
        BufferedReader br = new BufferedReader(reader);
        String linea = br.readLine();

        while (linea != null){
            list.add(linea);
            linea = br.readLine();
        }
        String usuario = etUsuario.getText().toString();
        String password = etPassword.getText().toString();
        boolean valido = false;
        for (String val: list
             ) {
            String[] arr = val.split("[-]");
            if (usuario.equals(arr[0]) && password.equals(arr[1])){
             valido = true;
             break;
            }
        }
        return valido;
    }
}