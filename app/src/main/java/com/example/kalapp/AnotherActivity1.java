package com.example.kalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AnotherActivity1 extends AppCompatActivity implements View.OnClickListener {
   // MediaPlayer Player;
    private Button start, stop;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another1);

        start=(Button) findViewById(R.id.buttonstart);
        stop=(Button) findViewById(R.id.buttonstop);

        start.setOnClickListener(this);
        stop.setOnClickListener(this);

       // MediaPlayer player = MediaPlayer.create(getApplicationContext(),R.raw.drake);
       // player.setLooping(true);
       // player.start();
    }

    @Override
    public void onClick(View view) {
        if(view==start){
            startService(new Intent(this,MyService.class));

        }else if(view==stop){
            stopService(new Intent(this,MyService.class));

        }

    }
}
