package com.example.projetofinal.Repositories;

import com.example.projetofinal.models.TrendingCoin;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class TrendingCoinRepository {
    private Map<Integer, TrendingCoin> trendingCoinsMap;

    //implementação do design Pattern Songleton
    private static TrendingCoinRepository instance = null;


    // altera o construtor para private -> Singleton
    private TrendingCoinRepository() {
        this.trendingCoinsMap = new HashMap<>();
    }

    //implementação do Singleton
    public static TrendingCoinRepository getInstance() {
        if (instance == null) {
            instance = new TrendingCoinRepository();
        }
        return instance;
    }


    //inclui um obj User no Repositorio / Map
    public void addTrendingCoin(TrendingCoin trendingCoin) {
        //falta lançar uma exceção para tratamento -> throws
        if (trendingCoin != null) {
            this.trendingCoinsMap.put(trendingCoin.getMarket_cap_rank(), trendingCoin);
        }
    }

    // retorna se um obj User está presento no Mapa
    public boolean contains(TrendingCoin trendingCoin) {
        return this.trendingCoinsMap.containsValue(trendingCoin);
    }

    /*
        Nome Método:
        Parametros: nome - objetivo
        Retoro: o que deve retornar
        comportamento:
     */
    // retorna se um obj está presente no Mapa por sei id
    public boolean contains(Integer id) {
        return this.trendingCoinsMap.containsKey(id);
    }

    // retorna uma Collection com todos os usuários
    public Collection<TrendingCoin> getTrendingCoins() {
        return this.trendingCoinsMap.values();
    }
    public TrendingCoin getCoin(int id) {
        return this.trendingCoinsMap.get(id);
    }
}
