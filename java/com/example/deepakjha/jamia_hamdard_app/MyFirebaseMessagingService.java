package com.example.deepakjha.jamia_hamdard_app;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

/**
 * Created by Deepak jha on 02-04-2017.
 */

public class MyFirebaseMessagingService extends FirebaseMessagingService {

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        Intent intent=new Intent(this,HomeScreen.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        PendingIntent pendingIntent=PendingIntent.getActivity(this,0,intent,PendingIntent.FLAG_ONE_SHOT);
        NotificationCompat.Builder notificationbuilder=new NotificationCompat.Builder(this);
        notificationbuilder.setContentTitle("Jamia Hamdard Notification");
        notificationbuilder.setContentText(remoteMessage.getNotification().getBody());
        notificationbuilder.setAutoCancel(true);
        notificationbuilder.setSmallIcon(R.drawable.jamialogoo);
        notificationbuilder.setContentIntent(pendingIntent);
        NotificationManager notificationManager=(NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        notificationManager.notify(0,notificationbuilder.build());
    }
}
