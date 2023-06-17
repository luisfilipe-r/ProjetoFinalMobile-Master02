package com.example.projetofinal.Views;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.projetofinal.Presenters.CoinPresenter;
import com.example.projetofinal.Presenters.CoinPresenterContract;
import com.example.projetofinal.Presenters.CoinPresenterLocal;
import com.example.projetofinal.R;

public class CoinsRVActivity extends AppCompatActivity implements CoinPresenterContract.View {

    private RecyclerView rv;
    LinearLayoutManager llm;
    LinearLayoutManager llmh;
    Button buttonBack;
    private CoinPresenterContract.Presenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coins_rvactivity);
        presenter = new CoinPresenterLocal(this);
        llm = new LinearLayoutManager(this);
        llmh = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);

        rv = findViewById(R.id.coinsRV);
        rv.setLayoutManager(llm);

        buttonBack = findViewById(R.id.back);
        buttonBack.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), HomeActivity.class);
            startActivity(intent);
        });

        findViewById(R.id.btn_busca_coins).setOnClickListener((v) -> {
            if (presenter instanceof CoinPresenter) {
                presenter = new CoinPresenterLocal(this);

            } else {
                presenter = new CoinPresenter(this);

            }
            presenter.getAllCoins();
        });
    }

    @Override
    public void setCoinsAdapter(RecyclerView.Adapter adapter) {

        rv.setAdapter(adapter);
    }

    @Override
    public Context getContexto() {
        return this.getApplicationContext();
    }

    public static class CadastroActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_cadastro);
        }
    }
}