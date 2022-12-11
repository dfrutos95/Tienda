package com.example.tienda;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.tienda.databinding.ActivityMainBinding;

/**
 * @author: Daniel Frutos, Jonanghel Jesus Barrera, Pablo Pedrazas
 */
public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    BottomNavigationView navView;
    ConstraintLayout cesta;
    //Button irConf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO); //para forzar el modo claro
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        navView = findViewById(R.id.nav_view);
        cesta = (ConstraintLayout) findViewById(R.id.Cesta10);
        //irConf = (Button) findViewById(R.id.irConf);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_main);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(binding.navView, navController);
    }

    public void abrir(View view){
        mostrarPrenda(view);

    }

    public void mostrarPrenda(View view){
        Button b = (Button) view;
        String nombre = String.valueOf(b.getText());
        Intent abrirTienda = new Intent(this, Prenda.class);
        abrirTienda.putExtra("Nombre", nombre);
        startActivity(abrirTienda);
    }

    public void abrirCesta(View view){
        mostrarCesta();
    }

    public void mostrarCesta(){
        Intent abrirCesta = new Intent(this, Activity_cesta.class);
        startActivity(abrirCesta);
    }

    public void abrirconfiguracion(View view){
        Intent intentconfi = new Intent(this, ConfiguracionActivity.class);
        startActivity(intentconfi);
    }

}