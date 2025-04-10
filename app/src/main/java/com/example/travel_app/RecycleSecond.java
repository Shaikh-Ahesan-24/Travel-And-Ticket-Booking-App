package com.example.travel_app;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecycleSecond extends RecyclerView.Adapter<RecycleSecond.Hill> {
    Context context;
    ArrayList<Second> seconds;
    public RecycleSecond(Context context,ArrayList<Second> seconds){
        this.context = context;
        this.seconds = seconds;
    }
    @NonNull
    @Override
    public Hill onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view =  LayoutInflater.from(context).inflate(R.layout.hill_station,parent,false);
        return new Hill(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Hill holder, int position) {
        holder.city.setImageResource(seconds.get(position).city);
        holder.name.setText(seconds.get(position).name);
        holder.description.setText(seconds.get(position).description);
        holder.itemView.setOnClickListener(view -> {
            Intent intent = new Intent(context, MainActivity7.class);
            intent.putExtra("profile",seconds.get(holder.getAdapterPosition()).city);
            intent.putExtra("name",seconds.get(holder.getAdapterPosition()).description);
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return seconds.size();
    }

    public static class  Hill extends RecyclerView.ViewHolder{
         ImageView city;
         TextView name;
         TextView description;
        public Hill(@NonNull View itemView) {

            super(itemView);
            city = itemView.findViewById(R.id.station);
            name = itemView.findViewById(R.id.name);
            description = itemView.findViewById(R.id.detail);

        }
    }
}
