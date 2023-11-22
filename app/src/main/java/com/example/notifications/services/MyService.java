package com.example.notifications.services;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Handler;
import android.os.IBinder;

import androidx.annotation.Nullable;

import com.example.notifications.R;

public class MyService extends Service
{
    MediaPlayer player;
//    Handler mHandler = new Handler();

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }


    @Override
    public void onCreate() {
        super.onCreate();

        player = MediaPlayer.create(this, R.raw.song);

    }

    @Override
    public void onStart(Intent intent, int startId) {
        super.onStart(intent, startId);
        player.start();

//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                // TODO Auto-generated method stub
//                while (true) {
//                    try {
//                        Thread.sleep(10000);
//                        mHandler.post(new Runnable() {
//
//                            @Override
//                            public void run() {
//                              getLastLocation();
//                            }
//                        });
//                    } catch (Exception e) {
//                        // TODO: handle exception
//                    }
//                }
//            }
//        }).start();
    }


    void getLastLocation()
    {
        //Todo: get user's current locatiion
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        player.stop();
    }
}
