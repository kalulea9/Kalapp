package com.example.kalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
//    public static String song = "";
   public static String gmail = "http:/gmail.com";
    TextView play;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
   public void sendMessage(View view){
        EditText message=(EditText) findViewById(R.id.message);
       Toast.makeText(this,"sending message"+message.getText().toString(),
               Toast.LENGTH_SHORT).show();
       Intent intent = new Intent(this, DisplayMessageActivity.class);
       intent.putExtra("MESSAGE", message.getText().toString()); startActivity(intent);
       message.setText("");
    }
    public boolean onCreateOptionsMenu(Menu menu){
    getMenuInflater().inflate(R.menu.menu, menu);
    return true;
    }
    public boolean onOptionsItemSelected(MenuItem items){
        int id = items.getItemId();
        switch (id){
            case R.id.music:
                startActivity(new Intent(this,AnotherActivity1.class));
                return true;
            case R.id.address:
                startActivity(new Intent(this, AnotherActivity2.class));
                return true;
                default:
        }
        return super.onOptionsItemSelected(items);
    }
}

