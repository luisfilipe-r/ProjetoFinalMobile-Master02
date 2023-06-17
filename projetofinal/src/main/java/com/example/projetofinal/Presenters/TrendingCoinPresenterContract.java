package com.example.projetofinal.Presenters;

import android.content.Context;

import androidx.recyclerview.widget.RecyclerView;

public interface TrendingCoinPresenterContract {

    interface View {
        void setTrendingCoinsAdapter(RecyclerView.Adapter adapter);
        Context getContexto();
    }

    interface Presenter {

        void getTrendingCoins();

    }
}
