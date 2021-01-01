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
        // providing the boolean  value as true to play
        // the audio on loop
        player.setLooping(true);

        //starting the process
        player.start();\
        // returns the status of the program
        return START_STICKY;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        // stopping the process
        player.stop();
    }
}
