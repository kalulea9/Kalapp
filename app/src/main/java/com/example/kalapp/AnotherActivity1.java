package com.example.kalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AnotherActivity1 extends AppCompatActivity {
    MediaPlayer mPlayer;

    Button btnPlay;

    Button btnPause;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another1);




        btnPlay = (Button) findViewById(R.id.button);
        btnPlay.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mPlayer = MediaPlayer.create(getApplicationContext(),R.raw.drake);//Create MediaPlayer object with MP3 file under res/raw folder
                    mPlayer.start();//Start playing the music
                }

            });
        btnPause = (Button) findViewById(R.id.button2);
        btnPause.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (mPlayer != null && mPlayer.isPlaying()) {//If music is playing already
                        mPlayer.stop();//Stop playing the music

                    }
                }
            });
    }

        }
