package com.example.thesmartfarm;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;



public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button tombol1 = (Button) findViewById(R.id.button1);
        Button tombol2 = (Button) findViewById(R.id.button2);
        Button tombol3 = (Button) findViewById(R.id.button3);
        Button tombol4 = (Button) findViewById(R.id.button4);
        Button tombol5 = (Button) findViewById(R.id.button5);

        tombol1.setOnClickListener(this);
        tombol2.setOnClickListener(this);
        tombol3.setOnClickListener(this);
        tombol4.setOnClickListener(this);
        tombol5.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button1:
                openLight();
            case R.id.button2:
                openFlow();
            case R.id.button3:
                openNotification();
            case R.id.button4:
                openTemperature();
            case R.id.button5:
                openPlant();
        }
    }
    public void openLight(){
        Intent intent = new Intent(this, Light.class);
        startActivity(intent);
    }
    public void openFlow(){
        Intent intent = new Intent(this, Flow.class);
        startActivity(intent);
    }
    public void openNotification(){
        Intent intent = new Intent(this, Notification.class);
        startActivity(intent);
    }
    public void openTemperature(){
        Intent intent = new Intent(this, Temperature.class);
        startActivity(intent);
    }
    public void openPlant(){
        Intent intent = new Intent(this, Plant.class);
        startActivity(intent);
    }
}
