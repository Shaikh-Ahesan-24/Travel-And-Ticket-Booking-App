package com.example.travel_app;

import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;



import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity10 extends AppCompatActivity {
    private static final String channel = "my channel";
    private static final int add = 100;

    AppCompatButton compatButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main10);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.payment);
        dialog.setCancelable(false);
        dialog.show();
        compatButton = dialog.findViewById(R.id.ok);
        Drawable drawable = ResourcesCompat.getDrawable(getResources(),R.drawable.travelling,null);
        BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
        Bitmap bitmap = null;
        if (bitmapDrawable != null) {
            bitmap = bitmapDrawable.getBitmap();
        }
        NotificationManager manager =(NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        Notification notification;


        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            notification = new Notification.Builder(this)
                    .setLargeIcon(bitmap)
                    .setSmallIcon(R.drawable.travelling)
                    .setContentTitle("Your Ticket Confirm Successfully !")
                    .setContentText("Your Seat Number Is 123-7280172012")
                    .setSubText("new Message")
                    .setChannelId(channel)

                    .build();
            manager.createNotificationChannel(new NotificationChannel(channel,"my",NotificationManager.IMPORTANCE_HIGH));
        }else{
            notification = new Notification.Builder(this)
                    .setSmallIcon(R.drawable.travelling)
                    .setContentTitle("Your Ticket Conform Successfully !")
                    .setContentText("Your Seat Number Is 123-7280172012")
                    .setSubText("New Message")
                    .build();
        }
     compatButton.setOnClickListener(view -> {
         dialog.dismiss();
         manager.notify(add,notification);

     });
    }
}