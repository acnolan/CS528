package com.example.hw1_screen2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int buttonCount1 = 0;
    private int buttonCount2 = 0;
    private int buttonCount3 = 0;

    TextView b1text;
    TextView b2text;
    TextView b3text;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        b1text = (TextView)findViewById(R.id.textView);
        b2text = (TextView)findViewById(R.id.textView2);
        b3text = (TextView)findViewById(R.id.textView3);
        b1text.setText("You have pressed button 1 0 times");
        b2text.setText("You have pressed button 2 0 times");
        b3text.setText("You have pressed button 3 0 times");
    }

    public void increment1(View b){
        buttonCount1++;
        b1text.setText("You have pressed button 1 " + buttonCount1 + " times");
    }

    public void increment2(View b){
        buttonCount2++;
        b2text.setText("You have pressed button 2 " + buttonCount2 + " times");
    }

    public void increment3(View b){
        buttonCount3++;
        b3text.setText("You have pressed button 3 " + buttonCount3 + " times");
    }
}