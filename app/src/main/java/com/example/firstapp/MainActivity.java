package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button[] buttons = new Button[9];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for (int num = 0; num < 9; num++) {
            buttons[num] = new Button(this);
        }

        buttons[0] = findViewById(R.id.button10);
        buttons[1] = findViewById(R.id.button11);
        buttons[2] = findViewById(R.id.button12);
        buttons[3] = findViewById(R.id.button13);
        buttons[4] = findViewById(R.id.button14);
        buttons[5] = findViewById(R.id.button15);
        buttons[6] = findViewById(R.id.button16);
        buttons[7] = findViewById(R.id.button17);
        buttons[8] = findViewById(R.id.button18);


        buttons[0].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                final TextView firstTextView = (TextView) findViewById(R.id.textView);
                firstTextView.setText("111111111111222222222222222333333333333333333333344444444444444444444444");
            }
        });
        buttons[1].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                final TextView firstTextView = (TextView) findViewById(R.id.textView);
                firstTextView.setText("2222222222");
            }
        });
        buttons[2].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                final TextView firstTextView = (TextView) findViewById(R.id.textView);
                firstTextView.setText("3333333333");
            }
        });
        buttons[3].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                final TextView firstTextView = (TextView) findViewById(R.id.textView);
                firstTextView.setText("44444444444444");
            }
        });
        buttons[4].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                final TextView firstTextView = (TextView) findViewById(R.id.textView);
                firstTextView.setText("555555555555");
            }
        });
        buttons[5].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                final TextView firstTextView = (TextView) findViewById(R.id.textView);
                firstTextView.setText("66666666");
            }
        });
        buttons[6].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                final TextView firstTextView = (TextView) findViewById(R.id.textView);
                firstTextView.setText("7777777777777");
            }
        });
        buttons[7].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                final TextView firstTextView = (TextView) findViewById(R.id.textView);
                firstTextView.setText("888888888888");
            }
        });
        buttons[8].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                final TextView firstTextView = (TextView) findViewById(R.id.textView);
                firstTextView.setText("999999999999999");
            }
        });


    }
}