package com.example.projetofinal.Views;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.projetofinal.Presenters.TrendingCoinPresenter;
import com.example.projetofinal.Presenters.TrendingCoinPresenterContract;
import com.example.projetofinal.Presenters.TrendingCoinPresenterLocal;
import com.example.projetofinal.R;

public class TrendingCoinActivity extends AppCompatActivity implements TrendingCoinPresenterContract.View {
    private RecyclerView rv;
    LinearLayoutManager llm;
    LinearLayoutManager llmh;
    Button buttonBack;
    private TrendingCoinPresenterContract.Presenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trending_coins_rvactivity);
        presenter = new TrendingCoinPresenterLocal(this);
        llm = new LinearLayoutManager(this);
        llmh = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);

        rv = findViewById(R.id.coinsRV);
        rv.setLayoutManager(llm);

        buttonBack = findViewById(R.id.back);
        buttonBack.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), HomeActivity.class);
            startActivity(intent);
        });

        findViewById(R.id.btn_busca_trending).setOnClickListener((v) -> {
            if (presenter instanceof TrendingCoinPresenter) {
                presenter = new TrendingCoinPresenterLocal(this);

            } else {
                presenter = new TrendingCoinPresenter(this);

            }
            presenter.getTrendingCoins();
        });
    }

    @Override
    public void setTrendingCoinsAdapter(RecyclerView.Adapter adapter) {

        rv.setAdapter(adapter);
    }

    @Override
    public Context getContexto() {
        return this.getApplicationContext();
    }

}
