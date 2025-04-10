package com.example.travel_app;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity7 extends AppCompatActivity {

    AppCompatButton compatButton;
    ImageView imageView;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main7);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        imageView = findViewById(R.id.pick);
        textView = findViewById(R.id.detail);
        compatButton = findViewById(R.id.bus);
        Bundle bundle = getIntent().getExtras();
        if(bundle !=null){
            imageView.setImageResource(bundle.getInt("profile"));
            textView.setText(getIntent().getExtras().getString("name"));
        }
        compatButton.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), MainActivity8.class);
            startActivity(intent);
        });

    }
}