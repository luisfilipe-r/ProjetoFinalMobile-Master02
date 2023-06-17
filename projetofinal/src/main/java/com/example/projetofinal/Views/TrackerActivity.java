package com.example.projetofinal.Views;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.projetofinal.R;

public class TrackerActivity extends AppCompatActivity {

    Button btnSalvar, btnMostar, btnVoltar;
    EditText editTitulo, editData, editDesc;
    TextView anotacaoTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tracker);

        btnSalvar = findViewById(R.id.button_salvar);
        btnMostar = findViewById(R.id.button_mostrar);
        btnVoltar = findViewById(R.id.button_voltar);
        editTitulo = findViewById(R.id.editTitulo);
        editData = findViewById(R.id.editData);
        editDesc = findViewById(R.id.editDesc);
        anotacaoTv = findViewById(R.id.anotacao);

        editTitulo.requestFocus();

        btnSalvar.setOnClickListener(view -> {
            SharedPreferences preferences = getSharedPreferences("Anotacao", MODE_PRIVATE);
            SharedPreferences.Editor editor = preferences.edit();
            editor.putString("Titulo", editTitulo.getText().toString());
            editor.putString("Data", editData.getText().toString());
            editor.putString("Descricao", editDesc.getText().toString());
            editor.commit();
            Toast.makeText(this, "Anotação: "+editTitulo.getText().toString()+" feita!", Toast.LENGTH_SHORT).show();
        });

        btnMostar.setOnClickListener(view -> {
            String titulo, data, descricao;
            SharedPreferences preferences = getSharedPreferences("Anotacao", MODE_PRIVATE);

            titulo = preferences.getString("Titulo", "");
            data = preferences.getString("Data", "");
            descricao = preferences.getString("Descricao", "");

            anotacaoTv.setText(titulo+"    "+data+"\n"+descricao);
        });

        btnVoltar.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), HomeActivity.class);
            startActivity(intent);
        });
    }
}