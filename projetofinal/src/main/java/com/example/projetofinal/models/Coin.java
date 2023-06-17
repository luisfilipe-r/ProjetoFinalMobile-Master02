package com.example.projetofinal.models;

import androidx.annotation.NonNull;

public class Coin {

    private String id;
    private String symbol;
    private String name;
    private String image;
    private int current_price;
    private int market_cap ;
    private int market_cap_rank;
    private int fully_diluted_valuation;
    private int total_volume;
    private int high_24h;
    private int low_24h;
    private int price_change_24h;
    private int price_change_percentage_24h;
    private int market_cap_change_24h;
    private int market_cap_change_percentage_24h;
    private int circulating_supply;
    private int total_supply;
    private int max_supply;
    private int ath;
    private int ath_change_percentage;
    private int atl;
    private int atl_change_percentage;

    public Coin(String id, String symbol, String name, String image, int current_price, int market_cap, int market_cap_rank, int fully_diluted_valuation, int total_volume, int high_24h, int low_24h, int price_change_24h, int price_change_percentage_24h, int market_cap_change_24h, int market_cap_change_percentage_24h, int circulating_supply, int total_supply, int max_supply, int ath, int ath_change_percentage, int atl, int atl_change_percentage) {
        this.id = id;
        this.symbol = symbol;
        this.name = name;
        this.image = image;
        this.current_price = current_price;
        this.market_cap = market_cap;
        this.market_cap_rank = market_cap_rank;
        this.fully_diluted_valuation = fully_diluted_valuation;
        this.total_volume = total_volume;
        this.high_24h = high_24h;
        this.low_24h = low_24h;
        this.price_change_24h = price_change_24h;
        this.price_change_percentage_24h = price_change_percentage_24h;
        this.market_cap_change_24h = market_cap_change_24h;
        this.market_cap_change_percentage_24h = market_cap_change_percentage_24h;
        this.circulating_supply = circulating_supply;
        this.total_supply = total_supply;
        this.max_supply = max_supply;
        this.ath = ath;
        this.ath_change_percentage = ath_change_percentage;
        this.atl = atl;
        this.atl_change_percentage = atl_change_percentage;
    }

    public String getId() { return id; }

    public void setId(String id) { this.id = id; }

    public String getSymbol() { return symbol; }

    public void setSymbol(String symbol) { this.symbol = symbol; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getImage() { return image; }

    public void setImage(String image) { this.image = image; }

    public int getCurrent_price() { return current_price; }

    public void setCurrent_price(int current_price) { this.current_price = current_price; }

    public int getMarket_cap() { return market_cap; }

    public void setMarket_cap(int market_cap) { this.market_cap = market_cap; }

    public int getMarket_cap_rank() { return market_cap_rank; }

    public void setMarket_cap_rank(int market_cap_rank) { this.market_cap_rank = market_cap_rank; }

    public int getFully_diluted_valuation() { return fully_diluted_valuation; }

    public void setFully_diluted_valuation(int fully_diluted_valuation) { this.fully_diluted_valuation = fully_diluted_valuation; }

    public int getTotal_volume() { return total_volume; }

    public void setTotal_volume(int total_volume) { this.total_volume = total_volume; }

    public int getHigh_24h() { return high_24h; }

    public void setHigh_24h(int high_24h) { this.high_24h = high_24h; }

    public int getLow_24h() { return low_24h; }

    public void setLow_24h(int low_24h) { this.low_24h = low_24h; }

    public int getPrice_change_24h() { return price_change_24h; }

    public void setPrice_change_24h(int price_change_24h) { this.price_change_24h = price_change_24h; }

    public int getPrice_change_percentage_24h() { return price_change_percentage_24h; }

    public void setPrice_change_percentage_24h(int price_change_percentage_24h) { this.price_change_percentage_24h = price_change_percentage_24h; }

    public int getMarket_cap_change_24h() { return market_cap_change_24h; }

    public void setMarket_cap_change_24h(int market_cap_change_24h) { this.market_cap_change_24h = market_cap_change_24h; }

    public int getMarket_cap_change_percentage_24h() { return market_cap_change_percentage_24h; }

    public void setMarket_cap_change_percentage_24h(int market_cap_change_percentage_24h) { this.market_cap_change_percentage_24h = market_cap_change_percentage_24h; }

    public int getCirculating_supply() { return circulating_supply; }

    public void setCirculating_supply(int circulating_supply) { this.circulating_supply = circulating_supply; }

    public int getTotal_supply() { return total_supply; }

    public void setTotal_supply(int total_supply) { this.total_supply = total_supply; }

    public int getMax_supply() { return max_supply; }

    public void setMax_supply(int max_supply) { this.max_supply = max_supply; }

    public int getAth() { return ath; }

    public void setAth(int ath) { this.ath = ath; }

    public int getAth_change_percentage() { return ath_change_percentage; }

    public void setAth_change_percentage(int ath_change_percentage) { this.ath_change_percentage = ath_change_percentage; }

    public int getAtl() { return atl; }

    public void setAtl(int atl) { this.atl = atl; }

    public int getAtl_change_percentage() { return atl_change_percentage; }

    public void setAtl_change_percentage(int atl_change_percentage) { this.atl_change_percentage = atl_change_percentage;}

    @NonNull
    @Override
    public String toString() {
        return "Nome:"+name+"; id: "+id+"; preço: "+current_price;
    }

}
