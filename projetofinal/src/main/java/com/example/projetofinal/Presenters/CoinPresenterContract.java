package com.example.projetofinal.Presenters;

import android.content.Context;

import androidx.recyclerview.widget.RecyclerView;

public interface CoinPresenterContract {
    interface View {
        void setCoinsAdapter(RecyclerView.Adapter adapter);
        Context getContexto();
    }

    interface Presenter {

        void getAllCoins();

    }
}
