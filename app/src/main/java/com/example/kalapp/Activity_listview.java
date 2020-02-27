package com.example.kalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Activity_listview extends AppCompatActivity {
ListView kalule;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);
        kalule=findViewById(R.id.parent);
        final ArrayList<String>arrayList=new ArrayList<>();
        arrayList.add("Java");
        arrayList.add("Java2");
        arrayList.add("Android");
        arrayList.add("ClientServer");
        arrayList.add("BusinessIntelligence");
        arrayList.add("DVS");
        arrayList.add("Statitics");
        arrayList.add("OperatingSystems");
        arrayList.add("WebDesign");
        arrayList.add("CommunicationSkills");
        arrayList.add("Cprogramming");
        arrayList.add("OOP");
        arrayList.add("Android");
        arrayList.add("ClientServer");
        arrayList.add("BusinessIntelligence");
        ArrayAdapter arrayAdapter= new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList);
kalule.setAdapter(arrayAdapter);
kalule.setOnItemClickListener(new AdapterView.OnItemClickListener() {
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }
});

        }
    }

