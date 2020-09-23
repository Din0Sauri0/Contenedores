package com.ovalle.contenedores;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class RecyclerViewActivity extends AppCompatActivity {

    RecyclerView recycler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        recycler = findViewById(R.id.recycler);

        recycler.setLayoutManager(new LinearLayoutManager(this));
        ArrayList<String> ciudades = new ArrayList<>();
        ciudades.add("Concepcion");
        ciudades.add("Santiago");
        ciudades.add("Temuco");
        ciudades.add("Villa Rica");

        MyAdapter adapter = new MyAdapter(ciudades);
        recycler.setAdapter(adapter);
    }
}