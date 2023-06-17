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
import com.squareup.picasso.Picasso;

import java.util.List;

public class CoinAdapter extends RecyclerView.Adapter<CoinAdapter.ViewHolder>{

    private List<Coin> coinsList;
    public CoinAdapter(List<Coin> coinsList) {
        this.coinsList = coinsList;
    }

    ImageView imageView;

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Create a new view, which defines the UI of the list item
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.view_holder_coin, parent, false);


        view.findViewById(R.id.button_detalhes).setOnClickListener((v)->{
            Toast.makeText(view.getContext(), "Mostrando os detalhes da moeda "+((Coin)view.getTag()).getName(), Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(view.getContext(), CoinDetailsActivity.class);
            intent.putExtra("Name",((Coin) view.getTag()).getName());
            intent.putExtra("Image",((Coin) view.getTag()).getImage());
            intent.putExtra("Symbol",((Coin) view.getTag()).getSymbol());
            intent.putExtra("Mkt Cap Rank",((Coin) view.getTag()).getMarket_cap_rank());
            intent.putExtra("Price",((Coin) view.getTag()).getCurrent_price());
            intent.putExtra("ATL",((Coin) view.getTag()).getAtl());
            intent.putExtra("ATH",((Coin) view.getTag()).getAth());
            intent.putExtra("Price Change 24h",((Coin) view.getTag()).getPrice_change_24h());
            intent.putExtra("Mkt Cap",((Coin) view.getTag()).getMarket_cap());
            intent.putExtra("High 24h",((Coin) view.getTag()).getHigh_24h());
            intent.putExtra("Low 24h",((Coin) view.getTag()).getLow_24h());
            view.getContext().startActivity(intent);
        });
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CoinAdapter.ViewHolder holder, int position) {
        Coin coin = coinsList.get(position);
        holder.view.setTag(coin);
        ((TextView) holder.view.findViewById(R.id.vhSymbol)).setText(coin.getSymbol());
        ((TextView) holder.view.findViewById(R.id.vhCoinName)).setText(coin.getName());
        ((TextView) holder.view.findViewById(R.id.vhPrice)).setText(""+coin.getCurrent_price()+" R$");
        ((TextView) holder.view.findViewById(R.id.vhMktCap)).setText(""+coin.getMarket_cap_rank());
        Picasso.get().load(coin.getImage()).into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return coinsList.size();
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
