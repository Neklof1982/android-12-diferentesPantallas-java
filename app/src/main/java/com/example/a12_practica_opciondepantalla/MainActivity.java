package com.example.a12_practica_opciondepantalla;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    int contador = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        TextView textoTitulo = findViewById(R.id.textTitulo);
        TextView textoNumero = findViewById(R.id.editTextNumero);
        Button botonElegir = findViewById((R.id.buttonElegir));


        botonElegir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Se convierte el texto a número, ya que es la pantalla elegida
                //Integer.parseInt(...) lo convierte a entero
                //String.value.of(...) lo convierte a String
                int textoPantalla = Integer.parseInt( String.valueOf(textoNumero.getText()));

                //Se crea un Bundle, que es un contenedor para los datos que se enviarán con el Intent.
                Bundle guardar = new Bundle();

                switch (textoPantalla) {
                    case 1:
                        //Se crea un nuevo Intent para pasar a la actividad `pantalla01`. Primera Pantalla
                        Intent intento1 = new Intent(MainActivity.this, Pantalla01.class);
                        //Se actualiza el contador para reflejar el número de veces que se va eligiendo
                        contador += 1;
                        //Se asocia el contador a la nueva variable que se envia a pantalla01
                        int contadorPantalla01 = contador;

                        //Se agrega al Bundle el valor de contadorPantalla01 con la clave "ELEGIDA"
                        guardar.putInt("ELEGIDA", contadorPantalla01);
                        //Se asocia el Bundle al Intent, para enviar los datos
                        intento1.putExtras(guardar);
                        //Se inicia la actividad pantalla01
                        startActivity(intento1);

                    case 2:

                }
            }
        });




    }
}