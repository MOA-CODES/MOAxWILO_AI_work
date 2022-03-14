package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class PVP extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p_v_p);
        Button home = findViewById(R.id.btnhome);
        home.setEnabled(false);
    }


    public void launchPVParena(View v){
        EditText a = findViewById(R.id.inputp1);
        EditText b = findViewById(R.id.inputp2);
        String p1 = a.getText().toString();
        String p2 = b.getText().toString();

        if(((p1.isEmpty())) && ((p2.isEmpty()))){
            Toast.makeText(this, "input p1 and p2", Toast.LENGTH_LONG).show();//alerting
        }else{
            Intent i = new Intent(this, Pvparena.class);
            i.putExtra("p1", p1);
            i.putExtra("p2", p2);
            startActivity(i);
        }
    }

}