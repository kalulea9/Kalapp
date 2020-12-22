package com.example.kalapp;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;

public class InternalAndExternalStorage {
    EditText etname;
    Button btcreate,btopen;
    String name;
    Button btnsave, btnload;
    EditText etinput;
    TextView tvload;
    String filename="";
    String filepath="";
    String filecontent="";

}

