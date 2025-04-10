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

public class RecycleFour extends RecyclerView.Adapter<RecycleFour.Bus> {
    Context context;
    ArrayList<Four> fours;
    public RecycleFour(Context context,ArrayList<Four> fours){
        this.context = context;
        this.fours = fours;
    }
    @NonNull
    @Override
    public Bus onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

       View view = LayoutInflater.from(context).inflate(R.layout.bus,parent,false);
        return new Bus(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Bus holder, int position) {
          holder.imageView.setImageResource(fours.get(position).profile);
          holder.name.setText(fours.get(position).name);
          holder.departure.setText(fours.get(position).departure);
          holder.arrival.setText(fours.get(position).arrival);
          holder.price.setText(fours.get(position).price);
          holder.itemView.setOnClickListener(view -> {
              Intent intent = new Intent(context, MainActivity9.class);
              context.startActivity(intent);
          });
    }

    @Override
    public int getItemCount() {
        return fours.size();
    }

    public static class Bus extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView name;
        TextView departure;
        TextView arrival;
        TextView price;
        public Bus(@NonNull View itemView) {

            super(itemView);
            imageView = itemView.findViewById(R.id.first);
            name = itemView.findViewById(R.id.second);
            departure = itemView.findViewById(R.id.departure);
            arrival = itemView.findViewById(R.id.arrival);
            price = itemView.findViewById(R.id.price);
        }
    }
}
