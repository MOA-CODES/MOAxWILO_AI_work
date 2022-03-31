package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class AIPVPSET extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a_i_p_v_p_s_e_t);
    }


    public void launchPVAI(View v){
        EditText a = findViewById(R.id.inputp1);
        String p1 = a.getText().toString();

        if((p1.isEmpty())){
            Toast.makeText(this, "input p1", Toast.LENGTH_LONG).show();//alerting
        }else{
            Intent i = new Intent(this, PvAI.class);
            i.putExtra("p1", p1);

            startActivity(i);
        }
    }

}