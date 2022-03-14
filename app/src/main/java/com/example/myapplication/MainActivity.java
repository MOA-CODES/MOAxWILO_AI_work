package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void play (View v){
        v.setEnabled(false);
        //R.id.play
        Log.d("success","disabled");
    }

    public void launchlocalplay(View v){
        Intent i = new Intent(this, LocalPlay.class);
        startActivity(i);
    }
    public void launchHome(View v){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

    public void launchExit(View v){
        finish();
        System.exit(0);
    }

}

