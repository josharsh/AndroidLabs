package com.example.androidlabs.Experiment9;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.androidlabs.R;

public class Experiment9 extends AppCompatActivity {
Button store,fetch;
EditText T1,T2,T3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_experiment9);
        final DatabaseHelper dbHelper=new DatabaseHelper(this,"MyDatabase",null,1);
        store=(Button)findViewById(R.id.StoreButton);
        fetch=(Button)findViewById(R.id.FetchButton);
        T1=(EditText)findViewById(R.id.idText);
        T2=(EditText)findViewById(R.id.nameText);
        T3=(EditText)findViewById(R.id.sapText);
        store.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                int id=Integer.parseInt(T1.getText().toString());
                String name=T2.getText().toString();
                String sap=T3.getText().toString();
                boolean isInserted=dbHelper.insertData(id,name,sap);
                if(isInserted){
                    Toast.makeText(Experiment9.this,"Successfully Inserted", Toast.LENGTH_LONG).show();}
                else
                {Toast.makeText(Experiment9.this,"Error Occurred, Please Try Again", Toast.LENGTH_LONG).show();}
            }

        });
        fetch.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
            Cursor CC=dbHelper.getAlldata();
            while(CC.moveToNext()){
                Toast.makeText(Experiment9.this,"Data: \n"+CC.getInt(1)+"\n"+CC.getString(1)+"\n"+CC.getString(2)+"\n", Toast.LENGTH_LONG).show();
            }
            }

        });
    }
}
