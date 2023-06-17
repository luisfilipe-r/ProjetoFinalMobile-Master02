package com.example.projetofinal.Presenters;

import com.example.projetofinal.Adapters.TrendingCoinAdapter;
import com.example.projetofinal.Repositories.CoinRepository;
import com.example.projetofinal.Repositories.TrendingCoinRepository;
import com.example.projetofinal.Services.CoinsService;

import java.util.ArrayList;

public class TrendingCoinPresenter implements TrendingCoinPresenterContract.Presenter {
    TrendingCoinPresenterContract.View view;
    public TrendingCoinPresenter(TrendingCoinPresenterContract.View view) {
        this.view = view;
    }

    @Override
    public void getTrendingCoins() {
        System.out.println("antes->"+ CoinRepository.getInstance().getCoins());

        CoinsService.getTrendingCoins(view.getContexto(), ()->{
            TrendingCoinAdapter adapter = new TrendingCoinAdapter(new ArrayList(TrendingCoinRepository.getInstance().getTrendingCoins()));
            view.setTrendingCoinsAdapter(adapter);
        });
    }
}
