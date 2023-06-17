package com.example.projetofinal.Adapters;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.projetofinal.R;
import com.example.projetofinal.Views.CoinDetailsActivity;
import com.example.projetofinal.models.Coin;
import com.example.projetofinal.models.TrendingCoin;
import com.squareup.picasso.Picasso;

import java.util.List;

public class TrendingCoinAdapter extends RecyclerView.Adapter<TrendingCoinAdapter.ViewHolder>{
    private List<TrendingCoin> trendingCoinList;
    public TrendingCoinAdapter(List<TrendingCoin> trendingCoinsList) {
        this.trendingCoinList = trendingCoinsList;
    }

    ImageView imageView;

    @NonNull
    @Override
    public TrendingCoinAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Create a new view, which defines the UI of the list item
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.view_holder_trending_coin, parent, false);
        return new TrendingCoinAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TrendingCoinAdapter.ViewHolder holder, int position) {
        TrendingCoin trendingCoin = trendingCoinList.get(position);
        holder.view.setTag(trendingCoin);
        ((TextView) holder.view.findViewById(R.id.vhSymbol)).setText(trendingCoin.getSymbol());
        ((TextView) holder.view.findViewById(R.id.vhCoinName)).setText(trendingCoin.getName());
        ((TextView) holder.view.findViewById(R.id.vhId)).setText(""+trendingCoin.getId());
        ((TextView) holder.view.findViewById(R.id.vhMktCap)).setText(""+trendingCoin.getMarket_cap_rank());
        ((TextView) holder.view.findViewById(R.id.vhBtcPrice)).setText(String.format("%.6f",(float)trendingCoin.getPrice_btc()," BTC"));
        Picasso.get().load(trendingCoin.getLarge()).into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return trendingCoinList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public View view;

        ImageView imageView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.view = itemView;
            imageView = itemView.findViewById(R.id.imageView);
        }
    }
}
