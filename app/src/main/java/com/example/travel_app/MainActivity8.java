package com.example.travel_app;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity8 extends AppCompatActivity {


    RecyclerView recyclerView;
    ArrayList<Four> fours = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main8);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        recyclerView = findViewById(R.id.buses);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        fours.add(new Four(R.drawable.sangitam,"Sangitam","8:00 AM","12:00 PM","Rs 20,000"));
        fours.add(new Four(R.drawable.syndicate,"syndicate","10:00 AM","2:00 PM","Rs 18,000"));
        fours.add(new Four(R.drawable.ashoka,"Ashoka","12:00 AM","5:00 PM","Rs 16,000"));
        fours.add(new Four(R.drawable.dolphin,"Dolphin","2:00 PM","8:00 AM","Rs 25,000"));
        fours.add(new Four(R.drawable.balaji,"Balaji","4:00 PM","10:00 PM","Rs 22,000"));
        fours.add(new Four(R.drawable.msrtc,"MSRTC","10:00 AM","8:00 PM","Rs 16,000"));
        fours.add(new Four(R.drawable.vaibhav,"Vaibhav","12:00 PM","5:00 AM","Rs 10,000"));
        RecycleFour adapter = new RecycleFour(this,fours);
        recyclerView.setAdapter(adapter);
    }
}