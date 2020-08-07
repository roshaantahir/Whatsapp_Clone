package com.example.whatsappc;

import android.annotation.SuppressLint;

import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

@SuppressLint("MissingFirebaseInstanceTokenRefresh")
public class MessegingService extends FirebaseMessagingService {
    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        super.onMessageReceived(remoteMessage);
        ShowNotification(remoteMessage.getNotification().getTitle(),remoteMessage.getNotification().getBody());
    }


    public void ShowNotification (String title, String message){





        NotificationCompat.Builder builder = new NotificationCompat.Builder(this, "FirstNotification")
                .setContentTitle(title)
                .setContentText(message)
                .setAutoCancel(true)
                .setSmallIcon(R.drawable.icon);
        NotificationManagerCompat notificationManager = NotificationManagerCompat.from(this);
        notificationManager.notify(0,builder.build());
    }
}
