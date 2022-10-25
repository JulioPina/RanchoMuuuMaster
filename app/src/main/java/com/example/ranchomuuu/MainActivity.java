package com.example.ranchomuuu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnacceso, btnsalir, btnregistrar;
    TextView usuario, contrasena;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        usuario = findViewById(R.id.CajaUsuario);
        contrasena = findViewById(R.id.CajaContrasena);

        btnacceso = findViewById(R.id.btnAcceder);

        btnacceso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(usuario.getText().toString().equals("ranchomuu") && contrasena.getText().toString().equals("equipo")){
                    Intent intent = new Intent(view.getContext(), MenuOpcionesActivity.class);
                    startActivity(intent);
                }else {
                    Toast.makeText(MainActivity.this, "Usuario o contraseña incorrecta", Toast.LENGTH_LONG).show();
                    usuario.setText("");
                    contrasena.setText("");
                }
            }
        });

        btnsalir = findViewById(R.id.btnCerrar);
        btnsalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "¡Hasta pronto!", Toast.LENGTH_SHORT).show();
                finishAffinity();
            }
        });
    }
}