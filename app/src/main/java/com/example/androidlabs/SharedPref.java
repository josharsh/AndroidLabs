package com.example.androidlabs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SharedPref extends AppCompatActivity {
EditText name,roll,sap,batch;
Button Btn,showBttn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_pref);
        name=(EditText)findViewById(R.id.nametext);
        roll=(EditText)findViewById(R.id.rolltext);
        sap=(EditText)findViewById(R.id.saptext);
        batch=(EditText)findViewById(R.id.batchtext);
        Btn=(Button)findViewById(R.id.GoBtn);
        showBttn=(Button)findViewById(R.id.showBtn);
        Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences S=getSharedPreferences("MySharedPref", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = S.edit();
                editor.putString("Name",name.getText().toString());
                editor.putString("Roll",roll.getText().toString());
                editor.putString("Sap",sap.getText().toString());
                editor.putString("Batch",batch.getText().toString());
                editor.commit();
                Toast.makeText(SharedPref.this,"Successfully Stored in SharedPrefrences",Toast.LENGTH_LONG).show();
            }
        });
        showBttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences S=getSharedPreferences("MySharedPref", Context.MODE_PRIVATE);
                String n=(String)S.getString("Name","Not Provided") ;
                String r=(String)S.getString("Roll","Not Provided") ;
                String s=(String)S.getString("Sap","Not Provided") ;
                String b=(String)S.getString("Batch","Not Provided") ;
                Toast.makeText(SharedPref.this,"Details:\n"+n+"\n"+r+"\n"+s+"\n"+b+"\n",Toast.LENGTH_LONG).show();
            }
        });
    }
}
