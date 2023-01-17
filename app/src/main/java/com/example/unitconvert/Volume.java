package com.example.unitconvert;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.chip.Chip;

public class Volume extends AppCompatActivity {
    EditText e1,e2;
    TextView t1,t2;
    Chip c1,c2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volume);
        e1=findViewById(R.id.editTextNumber4);
        e2=findViewById(R.id.editTextNumber7);

        c1=findViewById(R.id.chip6);
        c2=findViewById(R.id.chip7);

        t1=findViewById(R.id.textView16);
        t2=findViewById(R.id.textView22);


        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double input,output;
                input=Integer.parseInt(e1.getText().toString());
                output=input*0.000001;
                t1.setText(""+output);
            }
        });

        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double input,output;
                input=Integer.parseInt(e2.getText().toString());
                output=input*0.01;
                t2.setText(""+output);


            }
        });

    }
}