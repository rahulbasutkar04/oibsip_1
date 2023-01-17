package com.example.unitconvert;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.chip.Chip;

public class Temperature extends AppCompatActivity {
    EditText e1,e2;
    Chip c1,c2;
    TextView t1,t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperature);
        e1=findViewById(R.id.editTextNumber5);
        e2=findViewById(R.id.editTextNumber6);
        c1=findViewById(R.id.chip4);
        c2=findViewById(R.id.chip5);
        t1=findViewById(R.id.textView18);
        t2=findViewById(R.id.textView20);

        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float input,output;
                input=Integer.parseInt(e1.getText().toString());
                output=(input-32)*5/9;
                t1.setText("Temperature is:"+output);

            }
        });
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float input,output;
                input=Integer.parseInt(e2.getText().toString());
                output=(input*9/5)+32;
                t2.setText("Fahrenheit is:"+output);
            }
        });
    }
}