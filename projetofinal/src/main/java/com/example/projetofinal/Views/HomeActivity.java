package com.example.projetofinal.Views;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.projetofinal.R;

public class  HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button btn_analisar_moedas = findViewById(R.id.button_moedas);
        Button btn_acompanhar = findViewById(R.id.button_tracker);
        Button btn_moedas_em_alta = findViewById(R.id.button_trending);

        btn_analisar_moedas.setOnClickListener( view -> {
            Intent intent = new Intent(getApplicationContext(), CoinsRVActivity.class);
            startActivity(intent);
        });

        btn_acompanhar.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), TrackerActivity.class);
            startActivity(intent);
        });

        btn_moedas_em_alta.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), TrendingCoinActivity.class);
            startActivity(intent);
        });
    }
}