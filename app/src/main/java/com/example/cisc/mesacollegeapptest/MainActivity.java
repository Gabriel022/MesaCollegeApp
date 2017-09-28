package com.example.cisc.mesacollegeapptest;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button button1;
    Button button2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.button1:
                //DO something
                Intent y;
                y = new Intent(this, MesaCollegeActivity.class);
                startActivity(y);
                break;
            case R.id.button2:
                //DO something
                Intent z;
                String ad = "ada";
                z = new Intent(this,MesaCollegeActivity.class);
                System.out.println("Test");
                startActivity(z);
                break;
        }

    }
}
