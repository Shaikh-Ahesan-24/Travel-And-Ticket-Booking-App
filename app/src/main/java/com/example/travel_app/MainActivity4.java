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

public class MainActivity4 extends AppCompatActivity {


    RecyclerView recyclerView;
    ArrayList<Third> thirds = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main4);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        recyclerView = findViewById(R.id.flight);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        thirds.add(new Third(R.drawable.emirates,"Emirates","8:00 AM","11:00 AM","Rs 80,000"));
        thirds.add(new Third(R.drawable.singapor,"Singapore Airlines","11:00 PM","2:00 PM","Rs 70,000"));
        thirds.add(new Third(R.drawable.indigo,"Indigo","2:30 PM","4:30 PM","Rs 50,000"));
        thirds.add(new Third(R.drawable.airways,"Qatar Airways","5:00 PM","8:00 PM","Rs 40,000"));
        thirds.add(new Third(R.drawable.vistara,"Vistara","9:00 PM","11:30 PM","Rs 30,000"));
        thirds.add(new Third(R.drawable.spice,"SpiceJet","12:00 AM","2:30 AM","Rs 20,000"));
        RecycleThird recycleThird = new RecycleThird(this,thirds);
        recyclerView.setAdapter(recycleThird);

    }
}