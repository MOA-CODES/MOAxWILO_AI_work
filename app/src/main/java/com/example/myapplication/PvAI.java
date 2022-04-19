package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

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
                setTurn();AI();
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
                setTurn();AI();
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
                setTurn();AI();
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
                setTurn();AI();
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
                setTurn();AI();
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
                setTurn();AI();
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
                setTurn();AI();
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
                setTurn();AI();
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
                setTurn();AI();
            }
        });
    }
    public void buttonset(Button b){
        b.setText(turn);
    }
    public void win(){
        //player
        if((((Button)(findViewById(R.id.b1))).getText().toString()).equals(p1i)&&(((Button)(findViewById(R.id.b2))).getText().toString()).equals(p1i)&&(((Button)(findViewById(R.id.b3))).getText().toString()).equals(p1i)
                ||(((Button)(findViewById(R.id.b4))).getText().toString()).equals(p1i)&&(((Button)(findViewById(R.id.b5))).getText().toString()).equals(p1i)&&(((Button)(findViewById(R.id.b6))).getText().toString()).equals(p1i)
                ||(((Button)(findViewById(R.id.b7))).getText().toString()).equals(p1i)&&(((Button)(findViewById(R.id.b8))).getText().toString()).equals(p1i)&&(((Button)(findViewById(R.id.b9))).getText().toString()).equals(p1i)
                ||(((Button)(findViewById(R.id.b1))).getText().toString()).equals(p1i)&&(((Button)(findViewById(R.id.b4))).getText().toString()).equals(p1i)&&(((Button)(findViewById(R.id.b7))).getText().toString()).equals(p1i)
                ||(((Button)(findViewById(R.id.b2))).getText().toString()).equals(p1i)&&(((Button)(findViewById(R.id.b5))).getText().toString()).equals(p1i)&&(((Button)(findViewById(R.id.b8))).getText().toString()).equals(p1i)
                ||(((Button)(findViewById(R.id.b3))).getText().toString()).equals(p1i)&&(((Button)(findViewById(R.id.b6))).getText().toString()).equals(p1i)&&(((Button)(findViewById(R.id.b9))).getText().toString()).equals(p1i)
                ||(((Button)(findViewById(R.id.b1))).getText().toString()).equals(p1i)&&(((Button)(findViewById(R.id.b5))).getText().toString()).equals(p1i)&&(((Button)(findViewById(R.id.b9))).getText().toString()).equals(p1i)
                ||(((Button)(findViewById(R.id.b3))).getText().toString()).equals(p1i)&&(((Button)(findViewById(R.id.b5))).getText().toString()).equals(p1i)&&(((Button)(findViewById(R.id.b7))).getText().toString()).equals(p1i)){
            Toast.makeText(this, "x wins", Toast.LENGTH_LONG).show();
            p1w = p1w + 1; p2l = p2l +1; gamesplayed = gamesplayed +1;
            TextView winner = findViewById(R.id.xwins); winner.setText(""+p1w);
            TextView losser = findViewById(R.id.olosses); losser.setText(""+p2l);
            TextView gp = findViewById(R.id.gamesplayedcount); gp.setText(""+gamesplayed);cleargrid();
        }
        //AI
        if((((Button)(findViewById(R.id.b1))).getText().toString()).equals(p2i)&& (((Button)(findViewById(R.id.b2))).getText().toString()).equals(p2i)&& (((Button)(findViewById(R.id.b3))).getText().toString()).equals(p2i)
                ||(((Button)(findViewById(R.id.b4))).getText().toString()).equals(p2i)&&(((Button)(findViewById(R.id.b5))).getText().toString()).equals(p2i)&&(((Button)(findViewById(R.id.b6))).getText().toString()).equals(p2i)
                ||(((Button)(findViewById(R.id.b7))).getText().toString()).equals(p2i)&&(((Button)(findViewById(R.id.b8))).getText().toString()).equals(p2i)&&(((Button)(findViewById(R.id.b9))).getText().toString()).equals(p2i)
                ||(((Button)(findViewById(R.id.b1))).getText().toString()).equals(p2i)&&(((Button)(findViewById(R.id.b4))).getText().toString()).equals(p2i)&&(((Button)(findViewById(R.id.b7))).getText().toString()).equals(p2i)
                ||(((Button)(findViewById(R.id.b2))).getText().toString()).equals(p2i)&&(((Button)(findViewById(R.id.b5))).getText().toString()).equals(p2i)&&(((Button)(findViewById(R.id.b8))).getText().toString()).equals(p2i)
                ||(((Button)(findViewById(R.id.b3))).getText().toString()).equals(p2i)&&(((Button)(findViewById(R.id.b6))).getText().toString()).equals(p2i)&&(((Button)(findViewById(R.id.b9))).getText().toString()).equals(p2i)
                ||(((Button)(findViewById(R.id.b1))).getText().toString()).equals(p2i)&&(((Button)(findViewById(R.id.b5))).getText().toString()).equals(p2i)&&(((Button)(findViewById(R.id.b9))).getText().toString()).equals(p2i)
                ||(((Button)(findViewById(R.id.b3))).getText().toString()).equals(p2i)&&(((Button)(findViewById(R.id.b5))).getText().toString()).equals(p2i)&&(((Button)(findViewById(R.id.b7))).getText().toString()).equals(p2i)){
            Toast.makeText(this, "AI wins", Toast.LENGTH_LONG).show();
            p2w = p2w +1;p1l=p1l+1; gamesplayed = gamesplayed+1;
            TextView winner = findViewById(R.id.owins); winner.setText(""+p2w);
            TextView losser = findViewById(R.id.xlosses); losser.setText(""+p1l);
            TextView gp = findViewById(R.id.gamesplayedcount); gp.setText(""+gamesplayed);cleargrid();
        }
        //DRAW
        if((p1d == 5 && p2d ==4)||(p1d == 4 && p2d == 5)){
            Toast.makeText(this, "draw", Toast.LENGTH_LONG).show(); gamesplayed = gamesplayed+1;
            draw=draw+1;
            TextView draw = findViewById(R.id.drawcount); draw.setText(""+draw);
            TextView gp = findViewById(R.id.gamesplayedcount); gp.setText(""+gamesplayed);cleargrid();
        }

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

        Button b[] = new Button[9];
        b[0] = (Button)findViewById(R.id.b1);
        b[1] = (Button)findViewById(R.id.b2);
        b[2] = (Button)findViewById(R.id.b3);
        b[3] = (Button)findViewById(R.id.b4);
        b[4] = (Button)findViewById(R.id.b5);
        b[5] = (Button)findViewById(R.id.b6);
        b[6] = (Button)findViewById(R.id.b7);
        b[7] = (Button)findViewById(R.id.b8);
        b[8] = (Button)findViewById(R.id.b9);
        //middle play
        if(a[4].equals(p1i) && p1d == 1){
            int random = (int)(Math.random()*4);
            int formiddleplay[] = {0,2,6,8};
            int getb = formiddleplay[random];
            b[getb].setText(p2i);
            b[getb].setEnabled(false);
            setTurn();
        }
        //defense middle
        if(a[5-1].equals(p1i)&&p1d==2){
            if(a[1-1].equals(p1i)){
                b[9-1].setText(p2i);
                b[9-1].setEnabled(false);
                setTurn();
            }
            else if(a[2-1].equals(p1i)){
                b[8-1].setText(p2i);
                b[8-1].setEnabled(false);
                setTurn();
            }
            else if(a[3-1].equals(p1i)){
                b[7-1].setText(p2i);
                b[7-1].setEnabled(false);
                setTurn();
            }
            else if(a[4-1].equals(p1i)){
                b[6-1].setText(p2i);
                b[6-1].setEnabled(false);
                setTurn();
            }
            else if(a[6-1].equals(p1i)){
                b[4-1].setText(p2i);
                b[4-1].setEnabled(false);
                setTurn();
            }
            else if(a[7-1].equals(p1i)){
                b[3-1].setText(p2i);
                b[3-1].setEnabled(false);
                setTurn();
            }
            else if(a[8-1].equals(p1i)){
                b[2-1].setText(p2i);
                b[2-1].setEnabled(false);
                setTurn();
            }
            else if(a[9-1].equals(p1i)){
                b[1-1].setText(p2i);
                b[1-1].setEnabled(false);
                setTurn();
            }
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