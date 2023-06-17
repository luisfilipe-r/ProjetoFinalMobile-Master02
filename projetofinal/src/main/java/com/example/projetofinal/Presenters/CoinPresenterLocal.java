package com.example.projetofinal.Presenters;

import com.example.projetofinal.Adapters.CoinAdapter;
import com.example.projetofinal.Repositories.CoinRepository;
import com.example.projetofinal.models.Coin;

import java.util.ArrayList;

public class CoinPresenterLocal implements CoinPresenterContract.Presenter {
    CoinPresenterContract.View view;
    public CoinPresenterLocal(CoinPresenterContract.View view) {
        this.view = view;
    }

    @Override
    public void getAllCoins() {
        System.out.println("antes->"+ CoinRepository.getInstance().getCoins());
        ArrayList<Coin> coins = new ArrayList<>();
        Coin a = new Coin("testCoin", "test","test", "g@g.com.br", 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1);
        coins.add(a);
        CoinAdapter adapter = new CoinAdapter(coins);
        view.setCoinsAdapter(adapter);


    }
}
