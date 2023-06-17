package com.example.projetofinal.Repositories;

import com.example.projetofinal.models.Coin;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class CoinRepository {

    private Map<Integer, Coin> coinsMap;

    //implementação do design Pattern Songleton
    private static CoinRepository instance = null;


    // altera o construtor para private -> Singleton
    private CoinRepository() {
        this.coinsMap = new HashMap<>();
    }

    //implementação do Singleton
    public static CoinRepository getInstance() {
        if (instance == null) {
            instance = new CoinRepository();
        }
        return instance;
    }


    //inclui um obj User no Repositorio / Map
    public void addCoin(Coin coin) {
        //falta lançar uma exceção para tratamento -> throws
        if (coin != null) {
            this.coinsMap.put(coin.getMarket_cap_rank(), coin);
        }
    }

    // retorna se um obj User está presento no Mapa
    public boolean contains(Coin coin) {
        return this.coinsMap.containsValue(coin);
    }

    /*
        Nome Método:
        Parametros: nome - objetivo
        Retoro: o que deve retornar
        comportamento:
     */
    // retorna se um obj está presente no Mapa por sei id
    public boolean contains(Integer id) {
        return this.coinsMap.containsKey(id);
    }

    // retorna uma Collection com todos os usuários
    public Collection<Coin> getCoins() {
        return this.coinsMap.values();
    }
    public Coin getCoin(int id) {
        return this.coinsMap.get(id);
    }
}
