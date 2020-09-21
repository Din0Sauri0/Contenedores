package com.ovalle.contenedores;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnSpinner;
    private Button btnRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSpinner = findViewById(R.id.btnSpinner);
        btnRecyclerView = findViewById(R.id.btnRecyclerView);

        // Para cambiar entre pantallas es necesario crear un INTENT
        btnSpinner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Al construcctor del intent se le pasan dos parametros(ActivityActual,ActivityAlQueSeIra)
                Intent intentSpinner = new Intent(MainActivity.this, SpinnerActivity.class);
                startActivity(intentSpinner);
            }
        });
        btnRecyclerView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentRecyclerView = new Intent(MainActivity.this, RecyclerViewActivity.class);
                startActivity(intentRecyclerView);
            }
        });
    }
}