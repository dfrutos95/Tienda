package com.example.tienda;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Prenda extends AppCompatActivity {
    Drawable imagen;
    String nombre;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);

        setContentView(R.layout.activity_prenda);
        Bundle detalles = getIntent().getExtras();
        nombre = detalles.getString("Nombre");
        TextView tv = (TextView)findViewById(R.id.nombrePrenda);
        tv.setText(nombre);

    }
    public void cerrar(View view){
        salir();
    }

    public void salir(){
        Intent salir = new Intent(this, MainActivity.class);
        startActivity(salir);
    }
}