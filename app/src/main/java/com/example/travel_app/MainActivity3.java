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

public class MainActivity3 extends AppCompatActivity {

    ImageView imageView;
    TextView textView;
    AppCompatButton appCompatButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main3);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        imageView = findViewById(R.id.c);
        textView = findViewById(R.id.details);
        appCompatButton = findViewById(R.id.next);
        Bundle bundle = getIntent().getExtras();
        if(bundle !=null){
          imageView.setImageResource(bundle.getInt("img"));
          textView.setText(getIntent().getExtras().getString("txt"));
        }
       appCompatButton.setOnClickListener(view -> {
           Intent intent = new Intent(getApplicationContext(), MainActivity4.class);
           startActivity(intent);
       });
    }
}