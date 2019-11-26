package com.example.notification1028;
//這個是練習為了清楚只秀一個訊息,老師的範例可秀兩個訊息notification2
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    String strilove = "abc";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
                                                                                     //現在activity
        NotificationManager notificationmanager = (NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);
                        //(跟管理者說我現在這個activity要做通知服務)                                        //通知服務
                                                   //NotificationManager來自系統服務getSystemService
        //通知一設定
        NotificationChannel notificationchannel = new NotificationChannel(
                                   //通知服務從channel設定

                strilove,"def",
                NotificationManager.IMPORTANCE_HIGH);//最高權限
                notificationchannel.setDescription("ghijk");
                notificationchannel.enableLights(true);
                notificationchannel.enableVibration(true);//震動

                //依設定建立通知
        notificationmanager.createNotificationChannel(notificationchannel);
        //第一個訊息
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this,strilove)
                //compat當是容器
                .setSmallIcon(R.mipmap.love)
                .setContentTitle("LoveApp")
                .setContentText("情人節特賣開始了")
                .setAutoCancel(true);
        //啟動通知
        notificationmanager.notify(0,builder.build());








    }
}
