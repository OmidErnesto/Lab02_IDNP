package com.example.lab02_idnp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private static String TAG = "MainActivity";
    private List<Postulante> listaPostulantes = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText edtApellidoPaterno = findViewById(R.id.editTextApellidoPaterno);
        EditText edtApellidoMaterno = findViewById(R.id.editTextApellidoMaterno);
        EditText edtNombres = findViewById(R.id.editTextNombres);
        EditText edtFechaNacimiento = findViewById(R.id.editTextFechaNacimiento);
        EditText edtColegio = findViewById(R.id.editTextColegio);
        EditText edtCarrera = findViewById(R.id.editTextCarrera);

        Button btnEnviar = (Button) findViewById(R.id.buttonEnviar);
        Button btnListar = (Button) findViewById(R.id.buttonListar);

        btnEnviar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                String apellidoPaterno = edtApellidoPaterno.getText().toString();
                String apellidoMaterno = edtApellidoMaterno.getText().toString();
                String nombres = edtNombres.getText().toString();
                String fechaNacimiento = edtFechaNacimiento.getText().toString();
                String colegio = edtColegio.getText().toString();
                String carrera = edtCarrera.getText().toString();

                // Crea un nuevo postulante
                Postulante postulante = new Postulante(apellidoPaterno, apellidoMaterno, nombres, fechaNacimiento, colegio, carrera);

                // Agrega el postulante a la lista
                listaPostulantes.add(postulante);

                // Muestra los datos del postulante en LogCat
                Log.d(TAG, "Postulante registrado:");
                Log.d(TAG, "Apellido Paterno: " + postulante.getApellidoPaterno());
                Log.d(TAG, "Apellido Materno: " + postulante.getApellidoMaterno());
                Log.d(TAG, "Nombres: " + postulante.getNombres());
                Log.d(TAG, "Fecha de Nacimiento: " + postulante.getFechaNacimiento());
                Log.d(TAG, "Colegio: " + postulante.getColegio());
                Log.d(TAG, "Carrera: " + postulante.getCarrera());

            }
        });

        btnListar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for (Postulante postulante : listaPostulantes) {
                    Log.d(TAG, "Postulante registrado:");
                    Log.d(TAG, "Apellido Paterno: " + postulante.getApellidoPaterno());
                    Log.d(TAG, "Apellido Materno: " + postulante.getApellidoMaterno());
                    Log.d(TAG, "Nombres: " + postulante.getNombres());
                    Log.d(TAG, "Fecha de Nacimiento: " + postulante.getFechaNacimiento());
                    Log.d(TAG, "Colegio: " + postulante.getColegio());
                    Log.d(TAG, "Carrera: " + postulante.getCarrera());
                }
            }
        });

    }
}