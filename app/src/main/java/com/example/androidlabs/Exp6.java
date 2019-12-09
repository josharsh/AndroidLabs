package com.example.androidlabs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Exp6 extends AppCompatActivity {
Button GoogleButton,IntentGoButton;
EditText tt;
static private final String URL = "http://www.google.com";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exp6);
        tt=(EditText)findViewById(R.id.IntentText);
        GoogleButton=(Button)findViewById(R.id.googlebutton);
        GoogleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW);
                browserIntent.setData(Uri.parse(URL));
                startActivity(browserIntent);
            }
        });
        IntentGoButton=(Button)findViewById(R.id.IntentGo);
        IntentGoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=tt.getText().toString();
                Intent i=new Intent(Exp6.this,Exp6NameActivity.class);
                i.putExtra("Name",name);
                startActivity(i);
            }
        });
    }
}
