package com.example.androidlabs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.androidlabs.Experiment9.Experiment9;

public class TableOfContents extends AppCompatActivity {
Button exp6,exp7,exp8,exp9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_of_contents);
        exp6=(Button)findViewById(R.id.button5);
        exp6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(TableOfContents.this,Exp6.class);
                startActivity(i);

            }
        });
        exp7=(Button)findViewById(R.id.exp7Btn);
        exp7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(TableOfContents.this,Experiment7.class);
                startActivity(i);
            }
        });
        exp8=(Button)findViewById(R.id.exp8Btn);
        exp8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(TableOfContents.this,SharedPref.class);
                startActivity(i);
            }
        });
        exp9=(Button)findViewById(R.id.exp9Btn);
        exp9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(TableOfContents.this, Experiment9.class);
                startActivity(i);
            }
        });
    }
}
