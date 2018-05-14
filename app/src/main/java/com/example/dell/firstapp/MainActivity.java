package com.example.dell.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;


public class MainActivity extends AppCompatActivity {
private int R1;
private int R2;
private int point;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    //pick random number
        pickr();
    }
    public void pickr(){
        Random a = new Random();
        R1 = a.nextInt(10);

        Button l = (Button)findViewById(R.id.left_but);
        l.setText(Integer.toString(R1));
        R2 = a.nextInt(10);
        Button r = (Button)findViewById(R.id.right_but);
        r.setText(Integer.toString(R2));
    }


    public void leftbuttonclick(View view) {
if(R1 > R2) {
    point++;
}
else{
    point--;
}
        TextView tv = (TextView)findViewById(R.id.points);
        tv.setText("points" + point);
        pickr();
    }

    public void rightbuttonclick(View view) {

        if(R2 > R1) {
            point++;
        }
        else{
            point--;
        }
        TextView tv = (TextView)findViewById(R.id.points);
        tv.setText("points" + point);
        pickr();
    }

}
