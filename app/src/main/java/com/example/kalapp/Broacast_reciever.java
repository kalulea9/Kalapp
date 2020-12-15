package com.example.kalapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Vibrator;
import android.view.Gravity;
import android.widget.Toast;

public class Broacast_reciever extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
        Toast toast = Toast.makeText(context, "Stop your time is up!!!!.", Toast.LENGTH_LONG);
        //toast.setDuration();
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();

        // Vibrate the mobile phone
        Vibrator vibrator = (Vibrator) context.getSystemService(Context.VIBRATOR_SERVICE);
        vibrator.vibrate(4000);


    }
};
