package com.example.myfirstapplication;

import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

public class myFirebaseService extends FirebaseMessagingService {

    private static final String CANAL = "MyNotifCanal";

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        super.onMessageReceived(remoteMessage);

        String myMessage = remoteMessage.getNotification().getBody();

        //log qui permet de voir si on a recu la notif
        Log.d("FirebaseMessage=", "notre notif : " + myMessage);

        NotificationCompat.Builder notifBuilder = new NotificationCompat.Builder(this, CANAL);
        notifBuilder.setContentTitle("nouvelle notif");
        notifBuilder.setContentText(myMessage);
        notifBuilder.setSmallIcon(R.drawable.tong);

        NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        notificationManager.notify(1, notifBuilder.build());

    }
}
