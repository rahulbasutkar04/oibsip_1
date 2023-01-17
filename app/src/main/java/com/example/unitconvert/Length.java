package com.example.unitconvert;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.chip.Chip;

public class Length extends AppCompatActivity {
    EditText input,input1,input2,input3;
    TextView ans,ans1,ans2,ans3;

    Chip c,c1,c2,c3;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_length);
        ans=findViewById(R.id.textView12);
        ans1=findViewById(R.id.textView10);
        ans2=findViewById(R.id.textView14);
        ans3=findViewById(R.id.textView15);

        input=findViewById(R.id.editTextNumber);
        input1=findViewById(R.id.editTextNumber2);
        input2=findViewById(R.id.editTextTextPersonName);
        input3=findViewById(R.id.editTextNumber3);

        c=findViewById(R.id.chip);
        c1=findViewById(R.id.chip1);
        c2=findViewById(R.id.chip2);
        c3=findViewById(R.id.chip3);


        c.setOnClickListener(new View.OnClickListener() {
            @Override
             public void onClick(View view) {
                int meter,answ;
               meter=Integer.parseInt(input.getText().toString());
               answ=meter*100;
               ans.setText("Cms:"+answ);

//                int h,w;
//                float ans;
//                h=Integer.parseInt(e1.getText().toString());
//                w=Integer.parseInt(e2.getText().toString());
//                ans=(float)w/(h*h)*10000;
//                t.setText("Bmi is:" +ans);

            }
        });

        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float meter,answ;
                meter=Integer.parseInt(input1.getText().toString());
                answ= (float) (meter*1609.344);
                ans1.setText("Mtr:"+answ);

            }
        });
        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float miles,meter;
                miles=Integer.parseInt(input1.getText().toString());
                meter= (float) (miles*1609.34);
                ans1.setText("Foot is:"+meter);


            }
        });
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float inch,feet;
                inch=Integer.parseInt(input2.getText().toString());
                feet=inch/12;
                ans2.setText("Feet is:"+feet);
            }
        });

        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float foot,inch;
                foot=Integer.parseInt(input3.getText().toString());
                inch=foot*12;
                ans3.setText("Inches is:"+inch);
            }
        });
    }
}