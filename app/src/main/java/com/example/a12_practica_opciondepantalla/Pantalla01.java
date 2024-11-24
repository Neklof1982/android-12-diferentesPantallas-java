package com.example.a12_practica_opciondepantalla;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Pantalla01 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_pantalla01);

        TextView textoTitulo = findViewById(R.id.textTitulo);
        TextView textoContador = findViewById(R.id.textContador);
        TextView textoVeces = findViewById(R.id.textNumero);
        Button botonVolver01 = findViewById(R.id.buttonVolver01);

        // Obtiene los datos del Intent que inició esta actividad. `getExtras()` devuelve un Bundle con los extras.
        Bundle extras = this.getIntent().getExtras();

        // Recupera el valor entero de la temperatura usando la clave "ELEGIDA" del Bundle.
        int repeticiones = extras.getInt("ELEGIDA");

        textoVeces.setText(String.valueOf(repeticiones));

        botonVolver01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Cuando se presiona el botón salir se ejecuta el método finish() que tiene por objetivo
                //liberar el espacio de memoria de esta actividad y pedir que se muestre la actividad
                //anterior.
                finish();
            }
        });

    }
}