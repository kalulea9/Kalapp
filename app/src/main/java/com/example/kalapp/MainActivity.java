package com.example.kalapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

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
            ProgressBar pb = (ProgressBar) findViewById(R.id.progressBa);

            //Set progress level with battery % value
            pb.setProgress(level);

            //Find textview control created in main.xml
            TextView tv = (TextView) findViewById(R.id.btnAlarm);
            //Set TextView with text
            tv.setText("My Battery Level is at: " + Integer.toString(level) + "%");

           final EditText Firstname,Lastname,Reg_No;
            Button Submit,View_data;
            Firstname=findViewById(R.id.fname);
            Lastname=findViewById(R.id.lname);
            Reg_No=findViewById(R.id.regno);

            Submit=findViewById(R.id.submit_data);
            View_data=findViewById(R.id.view_data);

            Submit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String First_name=Firstname.getText().toString();
                    String Last_name=Lastname.getText().toString();
                    String Reg_N=Firstname.getText().toString();

                    if (First_name.isEmpty()) {
                        Toast.makeText(MainActivity.this, "enter first name", Toast.LENGTH_SHORT).show();
                    }

                       else if (Last_name.isEmpty()) {
                            Toast.makeText(MainActivity.this, "enter last name", Toast.LENGTH_SHORT).show();

                        }
                       else if (Reg_N.isEmpty()) {
                            Toast.makeText(MainActivity.this, "enter reg no", Toast.LENGTH_SHORT).show();

                    }else {
                           //submit to data base
                        //long user_added = helper.insertData(First_name,Last_name,Reg_N);
                    }
                }
            });
        }
    };
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            registerReceiver(br,new IntentFilter(Intent.ACTION_BATTERY_CHANGED));





        }

        public void sendMessage(View view) {
            EditText message = (EditText) findViewById(R.id.message);
            Toast.makeText(this, "sending message" + message.getText().toString(),
                    Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, DisplayMessageActivity.class);
            intent.putExtra("MESSAGE", message.getText().toString());
            startActivity(intent);
            message.setText("");
        }

    //Define a method to send alerts
    public void startAlert(View view){

        EditText text=(EditText)findViewById(R.id.textClick);
        int in = Integer.parseInt(text.getText().toString());

        //Create an intent and call your receiver
        Intent intent = new Intent(this,BroadcastReceiver.class);

        //Create a pending Intent to be fired
        PendingIntent pendingIntent = PendingIntent.getBroadcast(this.getApplicationContext(),0,intent,0);

        //Recall the alarm manager class
        AlarmManager alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);

        //Real time clock to be used

        alarmManager.set(AlarmManager.RTC_WAKEUP,System.currentTimeMillis() + (in * 1000),pendingIntent);
        Toast.makeText(this,"Alarm set in" + in + "seconds",Toast.LENGTH_LONG).show();
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

                case R.id.callPhone:


                case R.id.listView:
                    Intent i = new Intent(Intent.ACTION_SEND);
                    i.setData(Uri.parse("mailto"));
                    String to [] = {"kalulea9@gmail.com","kenks@yahaoo.com","kalulepeter979@gmail.com","peterkalule7@gmail.com"};
                    i.putExtra(Intent.EXTRA_EMAIL, to);
                    i.putExtra(Intent.EXTRA_SUBJECT, "Reminder");
                    i.putExtra(Intent.EXTRA_TEXT, "You are reminded to hand in your assignment as soon as possible");
                    i.setType("message/rfc822");

                    startActivity(i);
                    return true;
               // EditText UserEmail;
               // EditText PassWord;



        }
            return super.onOptionsItemSelected(items);
        }

    }


