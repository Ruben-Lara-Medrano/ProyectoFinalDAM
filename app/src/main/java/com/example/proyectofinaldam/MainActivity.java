package com.example.proyectofinaldam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "OnCreate", Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onStart() {
        super.onStart();

        Toast.makeText(this, "OnStart", Toast.LENGTH_SHORT).show();
        // La actividad está a punto de hacerse visible.
    }
    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "OnResume", Toast.LENGTH_SHORT).show();
        // La actividad se ha vuelto visible (ahora se "reanuda").
    }
    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "OnPause", Toast.LENGTH_SHORT).show();
        // Enfocarse en otra actividad  (esta actividad está a punto de ser "detenida").
    }
    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "OnStop", Toast.LENGTH_SHORT).show();
        // La actividad ya no es visible (ahora está "detenida")
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "OnDestroy", Toast.LENGTH_SHORT).show();
        // La actividad está a punto de ser destruida.
    }
    // METODOS PARA EL MENU DESPLEGABLE
    public boolean onCreateOptionsMenu(Menu menu){
        //Carpeta res - menu - overflow y pasamos el objeto menu
        getMenuInflater().inflate(R.menu.overflow, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        int id= item.getItemId();

        // Id de cada opcion del menu
        if(id == R.id.menuPrincipal){
            Toast.makeText(this, "menuPrincipal", Toast.LENGTH_SHORT).show();
        }else if(id == R.id.registro){
            Toast.makeText(this, "registro", Toast.LENGTH_SHORT).show();
        }else if(id == R.id.paginaPrincipal){
            Toast.makeText(this, "paginaPrincipal", Toast.LENGTH_SHORT).show();
        }

        return super.onOptionsItemSelected(item);
    }
}