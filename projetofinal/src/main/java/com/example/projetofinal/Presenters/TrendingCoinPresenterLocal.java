package com.example.projetofinal.Presenters;

import com.example.projetofinal.Adapters.TrendingCoinAdapter;
import com.example.projetofinal.Repositories.CoinRepository;
import com.example.projetofinal.Repositories.TrendingCoinRepository;
import com.example.projetofinal.models.Coin;
import com.example.projetofinal.models.TrendingCoin;

import java.util.ArrayList;

public class TrendingCoinPresenterLocal implements TrendingCoinPresenterContract.Presenter{
    TrendingCoinPresenterContract.View view;
    public TrendingCoinPresenterLocal(TrendingCoinPresenterContract.View view) {
        this.view = view;
    }

    @Override
    public void getTrendingCoins() {
        System.out.println("antes->"+ TrendingCoinRepository.getInstance().getTrendingCoins());
        ArrayList<TrendingCoin> trendingCoins = new ArrayList<>();
        TrendingCoin a = new TrendingCoin("testCoin", "test","test", "url", 1, 1);
        trendingCoins.add(a);
        TrendingCoinAdapter adapter = new TrendingCoinAdapter(trendingCoins);
        view.setTrendingCoinsAdapter(adapter);


    }
}
