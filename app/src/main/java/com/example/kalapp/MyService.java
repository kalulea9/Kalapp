package com.example.kalapp;
import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;

import androidx.annotation.Nullable;


public class MyService extends Service {
    private MediaPlayer player;
    @Nullable
    @Override

    public IBinder onBind(Intent intent){
        return null;
    }
    @Override
    public int onStartCommand(Intent intent, int flags, int startedId){

        player = MediaPlayer.create(getApplicationContext(),R.raw.drake);
        player.setLooping(true);
        player.start();
        return START_STICKY;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        player.stop();
    }
}
