package com.example.tienda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;

public class Activity_cesta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cesta);
    }

    public void cerrar(View view){
        salir();
    }

    public void salir(){
        Intent salir = new Intent(this, MainActivity.class);
        startActivity(salir);
    }
}