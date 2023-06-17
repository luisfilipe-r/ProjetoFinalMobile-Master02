package com.example.projetofinal.Views;

import android.content.Intent;
import android.os.Bundle;

import com.example.projetofinal.R;
import com.example.projetofinal.databinding.ActivityMainBinding;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseAuth;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        FirebaseApp.initializeApp(this);
        mAuth = FirebaseAuth.getInstance();

        binding.buttonLogin.setOnClickListener(v -> validarCredenciais());

        binding.buttonCadastro.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), CadastroActivity.class);
            startActivity(intent);
        });
    }

    private void validarCredenciais() {
        String email = binding.editEmail.getText().toString().trim();
        String senha = binding.editSenha.getText().toString().trim();

        if (!email.isEmpty()) {
            if (!senha.isEmpty()) {
                fazerLogin(email, senha);
            } else {
                Toast.makeText(this, "Informe uma senha.", Toast.LENGTH_LONG).show();
            }
        } else {
            Toast.makeText(this, "Informe seu email.", Toast.LENGTH_LONG).show();
        }
    }

    private void fazerLogin(String email, String senha) {
        mAuth.signInWithEmailAndPassword(email, senha)
                .addOnCompleteListener(task -> {
                    if (task.isSuccessful()) {
                        // Login com sucesso, redirecionar para a próxima tela
                        startActivity(new Intent(MainActivity.this, HomeActivity.class));
                        finish();
                    } else {
                        // Login falhou
                        Toast.makeText(this, "Falha no login. Verifique suas credenciais.", Toast.LENGTH_LONG).show();
                    }
                });
    }
}