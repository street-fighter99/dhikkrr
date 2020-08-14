package com.example.dhikkrr;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button BTminus,BTplus;
    TextView mycount,resetcount;
int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BTminus=findViewById(R.id.BTminus);
        BTplus=findViewById(R.id.BTplus);
        mycount=findViewById(R.id.count);
        resetcount=findViewById(R.id.reset);
        mycount.setText(0);


        BTminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(count==0){
                    count=0;

                }else {
                    count--;
                    mycount.setText(count + "");
                }


            }
        });
        BTplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                mycount.setText(count + "");
            }
        });

    }
}