package com.example.unitconvert;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        Thread t = new Thread() {

            public void run() {
                try {
                    sleep(4000);

                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    Intent i=new Intent(MainActivity.this,MainActivity2.class);
                    startActivity(i);

                }
            }


        }; t.start();


    }
}