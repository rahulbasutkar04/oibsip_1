package com.example.unitconvert;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.chip.Chip;

public class Weight extends AppCompatActivity {
    EditText e1,e2,e3;
    TextView t1,t2,t3;
    Chip c1,c2,c3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight);
        e1=findViewById(R.id.editTextNumber9);
        e2=findViewById(R.id.editTextNumber10);
        e3=findViewById(R.id.editTextNumber11);

        t1=findViewById(R.id.textView24);
        t2=findViewById(R.id.textView26);
        t3=findViewById(R.id.textView28);

        c1=findViewById(R.id.chip9);
        c2=findViewById(R.id.chip10);
        c3=findViewById(R.id.chip11);

        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double i,o;
                i=Integer.parseInt(e1.getText().toString());
                o=i*1000;
                t1.setText(""+o);

            }
        });

        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double i,o;
                i=Integer.parseInt(e2.getText().toString());
                o=i/1000;
                t2.setText(""+o);

            }
        });

        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double i,o;
                i=Integer.parseInt(e3.getText().toString());
                o=i*2.20462;
                t3.setText(""+o);

            }
        });


    }
}