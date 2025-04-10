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


public class RecycleFirst extends RecyclerView.Adapter<RecycleFirst.One> {
    Context context;
    ArrayList<First> firsts;
    public RecycleFirst(Context context,ArrayList<First> firsts){
        this.context = context;
        this.firsts = firsts;
    }
    @NonNull
    @Override
    public One onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.city,parent,false);
        return new One(view);
    }

    @Override
    public void onBindViewHolder(@NonNull One holder, int position) {
       holder.imageView.setImageResource(firsts.get(position).image);
       holder.name.setText(firsts.get(position).name);
       holder.country.setText(firsts.get(position).country);
       holder.description.setText(firsts.get(position).description);
       holder.itemView.setOnClickListener(view -> {
           Intent intent = new Intent(context, MainActivity3.class);
           intent.putExtra("img",firsts.get(holder.getAdapterPosition()).image);
           intent.putExtra("txt",firsts.get(holder.getAdapterPosition()).description);
           context.startActivity(intent);
       });
    }

    @Override
    public int getItemCount() {
        return firsts.size();
    }

    public static class One extends RecyclerView.ViewHolder{
         ImageView imageView;
         TextView name;
         TextView country;
         TextView description;
        public One(@NonNull View itemView) {

            super(itemView);
            imageView = itemView.findViewById(R.id.profile);
            name = itemView.findViewById(R.id.city);
            country = itemView.findViewById(R.id.country);
            description = itemView.findViewById(R.id.description);
        }
    }
}
