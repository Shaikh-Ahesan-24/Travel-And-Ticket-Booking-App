package com.example.travel_app;




import android.content.Intent;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.io.IOException;

public class MainActivity6 extends AppCompatActivity {


AppCompatButton pay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main6);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
           pay = findViewById(R.id.pay);

        MediaPlayer mp = new MediaPlayer();
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        String path = "android.resource://"+getPackageName()+"/raw/gpay";
        Uri uri = Uri.parse(path);
        try{
            mp.setDataSource(this,uri);
            mp.prepare();
        } catch (IOException e) {
         e.printStackTrace();
        }

       pay.setOnClickListener(view -> {
           Intent intent = new Intent(this, MainActivity10.class);
           mp.start();

           startActivity(intent);

       });

    }
}