package com.geeks.myapplication_3_4;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.geeks.myapplication_3_4.databinding.ItemContinentsBinding;

import java.util.ArrayList;

public class ContinentsAdapter extends RecyclerView.Adapter<ContinentsAdapter.ContinentsViewHolder> {

    public ContinentsAdapter(ArrayList<ContinentsModel> continentsList, AdapterClick adapterClick) {
        this.continentsList = continentsList;
        this.adapterClick = adapterClick;
    }


    private ArrayList<ContinentsModel> continentsList;

    private AdapterClick adapterClick;


    @NonNull
    @Override
    public ContinentsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemContinentsBinding binding = ItemContinentsBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new ContinentsViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ContinentsViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.onBind(continentsList.get(position));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adapterClick.onClick(position);

            }
        });
    }


    @Override
    public int getItemCount() {
        return continentsList.size();
    }

    public class ContinentsViewHolder extends RecyclerView.ViewHolder {

        private ItemContinentsBinding binding;

        public ContinentsViewHolder(@NonNull ItemContinentsBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void onBind(ContinentsModel continents) {
            binding.tvName.setText(continents.getName());
            Glide.with(binding.imgContinents).load(continents.getImage()).into(binding.imgContinents);

        }
    }
}