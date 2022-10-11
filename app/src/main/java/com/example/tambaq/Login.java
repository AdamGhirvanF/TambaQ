package com.example.tambaq;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    Button btnLogin;
    EditText etEmail;
    EditText etPassword;
    EditText etNamaLengkap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnLogin = findViewById(R.id.buttonSignUp);
        etEmail = findViewById(R.id.email);
        etPassword = findViewById(R.id.password);
        etNamaLengkap = findViewById(R.id.nama);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = etEmail.getText().toString();
                String password = etPassword.getText().toString();
                String nama = etNamaLengkap.getText().toString();
                if (email.isEmpty() || password.isEmpty() || nama.isEmpty()){
                    Toast.makeText(Login.this, "Email dan Password tidak boleh kosong", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(Login.this, "Berhasil Register", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(Login.this, MainActivity.class);
                    startActivity(intent);
                }
            }
        });


    }
}