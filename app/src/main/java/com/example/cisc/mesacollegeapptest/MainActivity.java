package com.example.cisc.mesacollegeapptest;

import android.Manifest;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button button1;
    Button callButton; //button 2


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button) findViewById(R.id.button1);
        callButton = (Button) findViewById(R.id.button2);
        button1.setOnClickListener(this);
        callButton.setOnClickListener(this);
    }


        @Override
        public void onClick (View v){
            switch (v.getId()) {
                case R.id.button1:
                    //DO something
                    Intent y;
                    y = new Intent(this, MesaCollegeActivity.class);
                    startActivity(y);
                    break;
                case R.id.button2:
                    //DO something
                 // Intent callIntent = new Intent(Intent.ACTION_DIAL); // For Intent.ACTION_DIALL you dont need a checkSelfPermission.
                    Intent callIntent = new Intent(Intent.ACTION_CALL);
                    callIntent.setData(Uri.parse("tel:619-388-2600"));

                    if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        //request permission from user if the app hasn't got the required permission
                        ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.CALL_PHONE},10);  //request specific permission from user
                        return;
                    }
                    else {     //have got permission
                        try{
                            startActivity(callIntent);  //call activity and make phone call
                        }
                        catch (android.content.ActivityNotFoundException ex){
                            Toast.makeText(getApplicationContext(),"yourActivity is not founded", Toast.LENGTH_SHORT).show();
                        }
                    }
            }


        }

}





