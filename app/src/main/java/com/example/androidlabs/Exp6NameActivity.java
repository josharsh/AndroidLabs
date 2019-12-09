package com.example.androidlabs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Exp6NameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exp6_name);
        TextView tt=(TextView)findViewById(R.id.textView11);
        Intent i=getIntent();
        String name=i.getStringExtra("Name");
        tt.setText(name);
    }
}
