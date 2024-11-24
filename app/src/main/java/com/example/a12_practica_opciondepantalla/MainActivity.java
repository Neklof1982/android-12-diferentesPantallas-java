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

    //Declaración de contadores de pantallas elegidas
    int contador01 = 0;
    int contador02 = 0;
    int contador03 = 0;
    int contador04 = 0;

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
                        contador01 +=1;
                        //Se asocia el contador01 a la nueva variable que se envia a pantalla01
                        int contadorPantalla01 = contador01;

                        //Se agrega al Bundle el valor de contadorPantalla01 con la clave "ELEGIDA"
                        guardar.putInt("ELEGIDA", contadorPantalla01);
                        //Se asocia el Bundle al Intent, para enviar los datos
                        intento1.putExtras(guardar);
                        //Se inicia la actividad pantalla01
                        startActivity(intento1);

                        //Para finalizar
                        break;

                    case 2:

                        //Se crea un nuevo Intent para pasar a la actividad `pantalla01`. Primera Pantalla
                        Intent intento2 = new Intent(MainActivity.this, Pantalla02.class);
                        //Se actualiza el contador para reflejar el número de veces que se va eligiendo
                        contador02 += 1;
                        //Se asocia el contador02 a la nueva variable que se envia a pantalla01
                        int contadorPantalla02 = contador02;

                        //Se agrega al Bundle el valor de contadorPantalla01 con la clave "ELEGIDA"
                        guardar.putInt("ELEGIDA", contadorPantalla02);
                        //Se asocia el Bundle al Intent, para enviar los datos
                        intento2.putExtras(guardar);
                        //Se inicia la actividad pantalla01
                        startActivity(intento2);
                        //Para finalizar
                        break;

                    case 3:

                        //Se crea un nuevo Intent para pasar a la actividad `pantalla01`. Primera Pantalla
                        Intent intento3 = new Intent(MainActivity.this, Pantalla03.class);
                        //Se actualiza el contador para reflejar el número de veces que se va eligiendo
                        contador03 += 1;
                        //Se asocia el contador02 a la nueva variable que se envia a pantalla01
                        int contadorPantalla03 = contador03;

                        //Se agrega al Bundle el valor de contadorPantalla01 con la clave "ELEGIDA"
                        guardar.putInt("ELEGIDA", contadorPantalla03);
                        //Se asocia el Bundle al Intent, para enviar los datos
                        intento3.putExtras(guardar);
                        //Se inicia la actividad pantalla01
                        startActivity(intento3);
                        //Para finalizar
                        break;

                    case 4:

                        //Se crea un nuevo Intent para pasar a la actividad `pantalla01`. Primera Pantalla
                        Intent intento4 = new Intent(MainActivity.this, Pantalla04.class);
                        //Se actualiza el contador para reflejar el número de veces que se va eligiendo
                        contador04 += 1;
                        //Se asocia el contador02 a la nueva variable que se envia a pantalla01
                        int contadorPantalla04 = contador04;

                        //Se agrega al Bundle el valor de contadorPantalla01 con la clave "ELEGIDA"
                        guardar.putInt("ELEGIDA", contadorPantalla04);
                        //Se asocia el Bundle al Intent, para enviar los datos
                        intento4.putExtras(guardar);
                        //Se inicia la actividad pantalla01
                        startActivity(intento4);
                        //Para finalizar
                        break;
                }
            }
        });




    }
}