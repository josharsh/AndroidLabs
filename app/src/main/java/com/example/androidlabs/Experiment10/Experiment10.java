package com.example.androidlabs.Experiment10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.androidlabs.Experiment9.Experiment9;
import com.example.androidlabs.R;

public class Experiment10 extends AppCompatActivity {
Button go;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_experiment10);
        go=(Button)findViewById(R.id.Clickhere);
        go.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Experiment10.this,MapsActivity.class);
                startActivity(i);
            }

        });
    }
}
