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

public class RecycleThird extends RecyclerView.Adapter<RecycleThird.Flight> {
 public RecycleThird(Context context, ArrayList<Third> thirds){
     this.context = context;
     this.thirds = thirds;
 }
    Context context;
 ArrayList<Third> thirds;
    @NonNull
    @Override
    public Flight onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view =  LayoutInflater.from(context).inflate(R.layout.flight,parent,false);
        return new Flight(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Flight holder, int position) {
          holder.logo.setImageResource(thirds.get(position).logo);
          holder.name.setText(thirds.get(position).name);
          holder.departure.setText(thirds.get(position).departure);
          holder.arrival.setText(thirds.get(position).arrival);
          holder.price.setText(thirds.get(position).price);
          holder.itemView.setOnClickListener(view -> {
              Intent intent = new Intent(context, MainActivity5.class);
              context.startActivity(intent);
          });
    }

    @Override
    public int getItemCount() {
        return thirds.size();
    }

    public static class Flight extends RecyclerView.ViewHolder{
         ImageView logo;
         TextView name;
         TextView departure;
         TextView arrival;
         TextView price;
        public Flight(@NonNull View itemView) {

            super(itemView);
            logo = itemView.findViewById(R.id.first);
            name = itemView.findViewById(R.id.second);
            departure = itemView.findViewById(R.id.departure);
            arrival = itemView.findViewById(R.id.arrival);
            price = itemView.findViewById(R.id.price);
        }
    }
}
