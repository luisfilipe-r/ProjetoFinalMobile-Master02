package com.example.projetofinal.Views;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.projetofinal.R;
import com.squareup.picasso.Picasso;

public class CoinDetailsActivity extends AppCompatActivity {

    TextView nameTv, symbolTv, mkt_capValueTv, priceTv, mkt_capTv, high24hTv, low24hTv, price_change24hTv, resultado, athTv, atlTv;
    String name, symbol;

    Integer price, mkt_cap, mkt_capValue, high24h, low24h, price_change24h, totalSupply, ath, atl;

    ImageView imageView;
    Button btnBack, btnCalculo, btnAcompanhar;

    EditText valorReais;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coin_details);
        btnBack = findViewById(R.id.btn_back);
        btnBack.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), CoinsRVActivity.class);
            startActivity(intent);
        });

        btnAcompanhar = findViewById(R.id.btn_acompanhar);
        btnAcompanhar.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), TrendingCoinActivity.class);
            startActivity(intent);
        });


        nameTv = findViewById(R.id.coinName);
        symbolTv = findViewById(R.id.simbolo);
        imageView = findViewById(R.id.imageView);
        priceTv = findViewById(R.id.preco);
        mkt_capTv = findViewById(R.id.mktCap);
        mkt_capValueTv = findViewById(R.id.mktValueCap);
        atlTv = findViewById(R.id.atl);
        athTv = findViewById(R.id.ath);
        high24hTv = findViewById(R.id.tfHigh);
        low24hTv = findViewById(R.id.tfLow);
        price_change24hTv = findViewById(R.id.altPrecoTv);

        Intent intent = getIntent();
        name = intent.getExtras().getString("Name");
        symbol = intent.getExtras().getString("Symbol");
        price = intent.getExtras().getInt("Price");
        mkt_cap = intent.getExtras().getInt("Mkt Cap Rank");
        mkt_capValue = intent.getExtras().getInt("Mkt Cap");
        ath = intent.getExtras().getInt("ATH");
        atl = intent.getExtras().getInt("ATl");
        high24h = intent.getExtras().getInt("High 24h");
        low24h = intent.getExtras().getInt("Low 24h");
        price_change24h = intent.getExtras().getInt("Price Change 24h");
        Picasso.get().load(intent.getExtras().getString("Image")).into(imageView);

        nameTv.setText(name);
        symbolTv.setText(symbol);
        mkt_capTv.setText(mkt_cap.toString());
        priceTv.setText(price.toString()+" R$");
        mkt_capValueTv.setText(mkt_capValue.toString()+" R$");
        athTv.setText(ath.toString()+" R$");
        atlTv.setText(atl.toString()+" R$");
        high24hTv.setText(high24h.toString()+" R$");
        low24hTv.setText(low24h.toString()+" R$");
        price_change24hTv.setText(price_change24h.toString()+" R$");

        valorReais = findViewById(R.id.editTextNumber);
        resultado = findViewById(R.id.resultado);

        btnCalculo = findViewById(R.id.btn_calculo);
        btnCalculo.setOnClickListener(v -> {
            int valor = Integer.parseInt(valorReais.getText().toString());
            resultado.setText(String.valueOf( valor /(float) price));
        });
    }
}
