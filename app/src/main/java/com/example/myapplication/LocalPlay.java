package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LocalPlay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_local_play);
    }

    public void launchHome(View v){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

    public void launchPVP(View v){
        Intent i = new Intent(this, PVP.class);
        startActivity(i);
    }

    public void launchAIPVP(View v){
        Intent i = new Intent(this, AIPVPSET.class);
        startActivity(i);
    }

}