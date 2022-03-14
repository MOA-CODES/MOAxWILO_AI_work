package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Pvparena extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pvparena);


        Button home = findViewById(R.id.btnhome);
        home.setEnabled(false);
        Intent i = getIntent();
        String p1 =  i.getStringExtra("p1")+"(x)";
        String p2 =  i.getStringExtra("p2")+"(o)";
        TextView td1 = findViewById(R.id.TurnDisplay);
        TextView sp1 = findViewById(R.id.Playerx);
        TextView sp2 = findViewById(R.id.Playero);
        sp1.setText(p1);sp2.setText(p2);
        td1.setText(p1);Button1();Button2();Button3();Button4();Button5();Button6();Button7();Button8();Button9();
    }
    private String turn = "x";
    private String p1i = "x";
    private String p2i = "o";
    private int p1w = 0;    private int p1l = 0;
    private int p2w = 0;     private int p2l = 0;
    private int gamesplayed = 0;
    public void setTurn(){
        TextView td = findViewById(R.id.TurnDisplay);

        if(turn.equals("x")){
            td.setText(((TextView)findViewById(R.id.Playero)).getText().toString());
            turn = "o";
        }else{
            td.setText(((TextView)findViewById(R.id.Playerx)).getText().toString());
            turn = "x";
        }
    }
    public void Button1(){
        Button b1 = findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonset(b1);
                disable(b1, false);
                setTurn();
                win();
            }
        });
    }
    public void Button2(){
        Button b1 = findViewById(R.id.b2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonset(b1);
                disable(b1, false);
                setTurn();win();
            }
        });
    }
    public void Button3(){
        Button b1 = findViewById(R.id.b3);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonset(b1);
                disable(b1, false);
                setTurn();win();
            }
        });
    }
    public void Button4(){
        Button b1 = findViewById(R.id.b4);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonset(b1);
                disable(b1, false);
                setTurn();win();
            }
        });
    }
    public void Button5(){
        Button b1 = findViewById(R.id.b5);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonset(b1);
                disable(b1, false);
                setTurn();win();
            }
        });
    }
    public void Button6(){
        Button b1 = findViewById(R.id.b6);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonset(b1);
                disable(b1, false);
                setTurn();win();
            }
        });
    }
    public void Button7(){
        Button b1 = findViewById(R.id.b7);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonset(b1);
                disable(b1, false);
                setTurn();win();
            }
        });
    }
    public void Button8(){
        Button b1 = findViewById(R.id.b8);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonset(b1);
                disable(b1, false);
                setTurn();win();
            }
        });
    }
    public void Button9(){
        Button b1 = findViewById(R.id.b9);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonset(b1);
                disable(b1, false);
                setTurn();win();
            }
        });
    }
    public void buttonset(Button b){
        b.setText(turn);
    }
    public void disable(Button b, boolean enable){
        b.setEnabled(enable);
    }
    public void win(){
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

        if((a[0].equals(p1i)&&a[1].equals(p1i)&&a[2].equals(p1i))
        ||(a[3].equals(p1i)&&a[4].equals(p1i)&&a[5].equals(p1i))
        ||(a[6].equals(p1i)&&a[7].equals(p1i)&&a[8].equals(p1i))
        ||(a[0].equals(p1i)&&a[3].equals(p1i)&&a[6].equals(p1i))
        ||(a[1].equals(p1i)&&a[4].equals(p1i)&&a[7].equals(p1i))
        ||(a[2].equals(p1i)&&a[5].equals(p1i)&&a[8].equals(p1i))
        ||(a[0].equals(p1i)&&a[4].equals(p1i)&&a[8].equals(p1i))
        ||(a[2].equals(p1i)&&a[4].equals(p1i)&&a[6].equals(p1i))){
            p1w = p1w + 1;
            ((TextView)findViewById(R.id.xwins)).setText(p1w);
            p2l = p2l + 1;
            ((TextView)findViewById(R.id.olosses)).setText(p2l);
            gamesplayed = gamesplayed +1;
            ((TextView)findViewById(R.id.GamesPlayed)).setText(gamesplayed);
            Toast.makeText(this, "x wins", Toast.LENGTH_LONG).show();//alerting

        }
        if((a[0].equals(p2i)&&a[1].equals(p2i)&&a[2].equals(p2i))
                ||(a[3].equals(p2i)&&a[4].equals(p2i)&&a[5].equals(p2i))
                ||(a[6].equals(p2i)&&a[7].equals(p2i)&&a[8].equals(p2i))
                ||(a[0].equals(p2i)&&a[3].equals(p2i)&&a[6].equals(p2i))
                ||(a[1].equals(p2i)&&a[4].equals(p2i)&&a[7].equals(p2i))
                ||(a[2].equals(p2i)&&a[5].equals(p2i)&&a[8].equals(p2i))
                ||(a[0].equals(p2i)&&a[4].equals(p2i)&&a[8].equals(p2i))
                ||(a[2].equals(p2i)&&a[4].equals(p2i)&&a[6].equals(p2i))){
            p2w = p2w + 1;
            ((TextView)findViewById(R.id.owins)).setText(p2w);
            p1l = p1l + 1;
            ((TextView)findViewById(R.id.xlosses)).setText(p1l);
            gamesplayed = gamesplayed +1;
            ((TextView)findViewById(R.id.GamesPlayed)).setText(gamesplayed);
            Toast.makeText(this, "o wins", Toast.LENGTH_LONG).show();//alerting

        }
    }


}