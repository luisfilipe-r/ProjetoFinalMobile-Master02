package com.example.projetofinal.Presenters;

import android.util.Log;

import com.example.projetofinal.Adapters.CoinAdapter;
import com.example.projetofinal.Repositories.CoinRepository;
import com.example.projetofinal.Services.CoinsService;

import java.util.ArrayList;

public class CoinPresenter implements CoinPresenterContract.Presenter {
    CoinPresenterContract.View view;
    public CoinPresenter(CoinPresenterContract.View view) {
        this.view = view;
    }

    @Override
    public void getAllCoins() {
        System.out.println("antes->"+ CoinRepository.getInstance().getCoins());

        CoinsService.getAllCoins(view.getContexto(), ()->{
            CoinAdapter adapter = new CoinAdapter(new ArrayList(CoinRepository.getInstance().getCoins()));
            view.setCoinsAdapter(adapter);
        });
    }
}
