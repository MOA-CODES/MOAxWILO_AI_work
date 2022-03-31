package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PvAI extends AppCompatActivity {

    private String turn = "x";
    private String p1i = "x";
    private String p2i = "o";
    private String AIT = "AI";
    private int p1w = 0;    private int p1l = 0;
    private int p2w = 0;     private int p2l = 0;
    private int gamesplayed = 0; private int p1d = 0; private int p2d = 0;
    private int draw = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pv_a_i);Button1();Button2();Button3();Button4();Button5();Button6();
        Button7();Button8();Button9();

        Button home = findViewById(R.id.btnhome);
        home.setEnabled(false);
        Intent i = getIntent();
        String p1 =  i.getStringExtra("p1")+"(x)";
        TextView td1 = findViewById(R.id.TurnDisplay);
        TextView sp1 = findViewById(R.id.Playerx);
        TextView sp2 = findViewById(R.id.Playero);sp1.setText(p1); td1.setText(p1);sp2.setText("AI(o)");
    }

    public void setTurn(){
        TextView td = findViewById(R.id.TurnDisplay);
        if(turn.equals(p1i)){
            p1d= p1d +1;
            td.setText(((TextView)findViewById(R.id.Playero)).getText().toString());
            turn = p2i;
        }else{p2d = p2d +1;
            td.setText(((TextView)findViewById(R.id.Playerx)).getText().toString());
            turn = p1i;
        }
    }
    public void Button1(){
        Button b1 = findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonset(b1);
                b1.setEnabled(false);
                win();
                setTurn();
            }
        });
    }
    public void Button2(){
        Button b1 = findViewById(R.id.b2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonset(b1);
                b1.setEnabled(false);
                win();
                setTurn();
            }
        });
    }
    public void Button3(){
        Button b1 = findViewById(R.id.b3);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonset(b1);
                b1.setEnabled(false);
                win();
                setTurn();
            }
        });
    }
    public void Button4(){
        Button b1 = findViewById(R.id.b4);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonset(b1);
                b1.setEnabled(false);
                win();
                setTurn();
            }
        });
    }
    public void Button5(){
        Button b1 = findViewById(R.id.b5);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonset(b1);
                b1.setEnabled(false);
                win();
                setTurn();
            }
        });
    }
    public void Button6(){
        Button b1 = findViewById(R.id.b6);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonset(b1);
                b1.setEnabled(false);
                win();
                setTurn();
            }
        });
    }
    public void Button7(){
        Button b1 = findViewById(R.id.b7);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonset(b1);
                b1.setEnabled(false);
                win();
                setTurn();
            }
        });
    }
    public void Button8(){
        Button b1 = findViewById(R.id.b8);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonset(b1);
                b1.setEnabled(false);
                win();
                setTurn();
            }
        });
    }
    public void Button9(){
        Button b1 = findViewById(R.id.b9);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonset(b1);
                b1.setEnabled(false);
                win();
                setTurn();
            }
        });
    }
    public void buttonset(Button b){
        b.setText(turn);
    }
    public void win(){

    }
    public void AI(){
        String a[] = new String[9];
        a[0] = ((Button)(findViewById(R.id.b1))).getText().toString();
        a[1] = ((Button)(findViewById(R.id.b2))).getText().toString();
        a[2] = ((Button)(findViewById(R.id.b3))).getText().toString();
        a[3] = ((Button)(findViewById(R.id.b4))).getText().toString();
        a[4] = ((Button)(findViewById(R.id.b5))).getText().toString();
        a[5] = ((Button)(findViewById(R.id.b6))).getText().toString();
        a[6] = ((Button)(findViewById(R.id.b7))).getText().toString();
        a[7] = ((Button)(findViewById(R.id.b8))).getText().toString();
        a[8] = ((Button)(findViewById(R.id.b9))).getText().toString();

        if(a[4].equals(p1i)){

        }

    }
    public void cleargrid(){
        p1d = 0; p2d = 0;
        Button b1 = findViewById(R.id.b1);
        Button b2 = findViewById(R.id.b2);
        Button b3 = findViewById(R.id.b3);
        Button b4 = findViewById(R.id.b4);
        Button b5 = findViewById(R.id.b5);
        Button b6 = findViewById(R.id.b6);
        Button b7 = findViewById(R.id.b7);
        Button b8 = findViewById(R.id.b8);
        Button b9 = findViewById(R.id.b9);

        b1.setEnabled(true);
        b2.setEnabled(true);
        b3.setEnabled(true);
        b4.setEnabled(true);
        b5.setEnabled(true);
        b6.setEnabled(true);
        b7.setEnabled(true);
        b8.setEnabled(true);
        b9.setEnabled(true);

        b1.setText("");
        b2.setText("");
        b3.setText("");
        b4.setText("");
        b5.setText("");
        b6.setText("");
        b7.setText("");
        b8.setText("");
        b9.setText("");
    }

}