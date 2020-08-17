package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    EditText num1;
    EditText num2;

    String Number1;
    String Number2;

    TextView lblsum;

    int number1 , number2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        num1 = findViewById(R.id.number1);
        num2 = findViewById(R.id.number2);
        lblsum = findViewById(R.id.lblsum);

        Intent intent = getIntent();

        Number1 = intent.getStringExtra("number1");
        Number2 = intent.getStringExtra("number2");

        num1.setText(Number1);
        num2.setText(Number2);

        number1 = Integer.parseInt(Number1);
        number2 = Integer.parseInt(Number2);
    }

    public  void add(View view) {

        lblsum.setText(Number1 +" + "+ Number2 + " = " + (number1+number2));
    }

    public  void decrease(View view) {

        lblsum.setText(Number1 +" - "+ Number2 + " = " + (number1-number2));
    }

    public  void multiply(View view) {

        lblsum.setText(Number1 +" * "+ Number2 + " = " + (number1*number2));
    }

    public  void substract(View view) {

        lblsum.setText(Number1 +" / "+ Number2 + " = " + (number1/number2));
    }
}