package com.ovalle.contenedores;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;

public class SpinnerActivity extends AppCompatActivity {
    private Spinner spinnerXml, spinnerJava;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);

        spinnerXml = findViewById(R.id.spinnerXml);
        spinnerJava = findViewById(R.id.spinnerJava);

        //Crear un adaptador para el spinner
        ArrayAdapter<CharSequence> adapterForXml = ArrayAdapter.createFromResource(SpinnerActivity.this, R.array.planets_array,  android.R.layout.simple_spinner_item);
        //cargar adaptador al spinner
        spinnerXml.setAdapter(adapterForXml);

        //cargar spinner mediante JAVA
        //Crear ArrayList
        ArrayList<String> ciudades = new ArrayList<>();
        //agregar items al ArrayList
        ciudades.add("Santiago");
        ciudades.add("Concepcion");
        ciudades.add("Temuco");
        //Crear un adaptador para el spinner
        ArrayAdapter<String> adapterForJAVA = new ArrayAdapter<>(SpinnerActivity.this, android.R.layout.simple_spinner_item, ciudades);
        //cargar adaptador al spinner
        spinnerJava.setAdapter(adapterForJAVA);
    }
}