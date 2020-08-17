package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText num1;
    EditText num2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);

    }

    public void openSecond(View view) {

        Intent intent = new Intent(this,MainActivity2.class);
        intent.putExtra("number1",num1.getText().toString());
        intent.putExtra("number2",num2.getText().toString());

        //Toast.makeText(this, "Opening calculator....", Toast.LENGTH_LONG).show();


        LayoutInflater li = getLayoutInflater();

        View layout = li.inflate(R.layout.custom, (ViewGroup) findViewById(R.id.image));

        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.setView(layout);//setting the view of custom toast layout
        toast.show();


        startActivity(intent);
    }
}