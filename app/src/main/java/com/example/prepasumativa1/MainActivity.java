package com.example.prepasumativa1;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    private Button  btnCrearCuenta = null;
    private Button btnIniciarSesion = null;
    private TextView txtCorreoInicio = null;
    private TextView txtPassInicio = null;
    private EditText txtIngCorreo = null;
    private EditText txtIngPass = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCrearCuenta = findViewById(R.id.btn_crear_cuenta);
        btnIniciarSesion = findViewById(R.id.btn_iniciar.sesion);



    }
}