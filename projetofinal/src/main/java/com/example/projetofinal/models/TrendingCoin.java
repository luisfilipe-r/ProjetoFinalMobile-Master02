package com.example.projetofinal.models;

import androidx.annotation.NonNull;

public class TrendingCoin {

    private String id;
    private String symbol;
    private String name;
    private String large;
    private int market_cap_rank;
    private int price_btc;

    public TrendingCoin(String id, String symbol, String name, String large, int market_cap_rank, int price_btc) {
        this.id = id;
        this.symbol = symbol;
        this.name = name;
        this.large = large;
        this.market_cap_rank = market_cap_rank;
        this.price_btc = price_btc;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLarge() {
        return large;
    }

    public void setLarge(String large) {
        this.large = large;
    }

    public int getMarket_cap_rank() {
        return market_cap_rank;
    }

    public void setMarket_cap_rank(int market_cap_rank) {
        this.market_cap_rank = market_cap_rank;
    }

    public int getPrice_btc() {
        return price_btc;
    }

    public void setPrice_btc(int price_btc) {
        this.price_btc = price_btc;
    }

    @NonNull
    @Override
    public String toString() {
        return "Nome:"+name+"; id: "+id+"; preço: "+price_btc;
    }
}
