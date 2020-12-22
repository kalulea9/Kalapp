package com.example.kalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import android.Manifest;
import android.app.AlarmManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.media.RingtoneManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.provider.MediaStore;
//import android.support.design.widget.FloatingActionButton;
//import android.support.design.widget.Snackbar;
//import android.support.v4.app.ActivityCompat;
//import android.support.v4.app.NotificationCompat;
//import android.support.v4.content.ContextCompat;
//import android.support.v7.app.AppCompatActivity;
//import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view. Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    //Create Broadcast Receiver Object along with class definition
    private BroadcastReceiver br = new BroadcastReceiver() {

        @Override
        //When Event is published, onReceive method is called
        public void onReceive(Context c, Intent i) {
            //Get Battery %
            int level = i.getIntExtra("level", 0);
            //Find the progressbar created in main.xml
            ProgressBar pb = (ProgressBar) findViewById(R.id.bar);

            //Set progress level with battery % value
            pb.setProgress(level);

            //Find textview control created in main.xml
            TextView tv = (TextView) findViewById(R.id.bat);
            //Set TextView with text
            tv.setText("My Battery Level is at: " + Integer.toString(level) + "%");
        }
    };



        public static String gmail = "https://www.gmail.com";
        TextView play;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            registerReceiver(br,new IntentFilter(Intent.ACTION_BATTERY_CHANGED));



        }

        public void sendMessage(View view) {
            EditText message = (EditText) findViewById(R.id.sendmessage);
            Toast.makeText(this, "sending message" + message.getText().toString(),
                    Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, DisplayMessageActivity.class);
            intent.putExtra("MESSAGE", message.getText().toString());
            startActivity(intent);
            message.setText("");
        }

        public boolean onCreateOptionsMenu(Menu menu) {
            getMenuInflater().inflate(R.menu.menu, menu);
            return true;

        }
        public boolean onOptionsItemSelected(MenuItem items) {
            //Handle action bar item clicks here.the action bar will automatically handle clicks on the Home/up button
            //so long as a parent activity in android manifest .xml is specified
            int id = items.getItemId();
            switch (id) {
                case R.id.showmusic:
                    startActivity(new Intent(this, AnotherActivity1.class));
                    startActivity(new Intent(this, AnotherActivity2.class));
                    return true;
                case R.id.listView:
                    startActivity(new Intent(this, Activity_listview.class));
                    return true;

            }
            return super.onOptionsItemSelected(items);
        }
    }


