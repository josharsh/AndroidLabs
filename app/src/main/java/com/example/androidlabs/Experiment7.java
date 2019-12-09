package com.example.androidlabs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Experiment7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_experiment7);
        ArrayList<CricketTeam> teamArray = new ArrayList<CricketTeam>();
// Create the adapter to convert the array to views
        CricketAdapter adapter = new CricketAdapter(this, teamArray);
// Attach the adapter to a ListView
        ListView listView = (ListView) findViewById(R.id.cricketList);
        listView.setAdapter(adapter);
        CricketTeam india = new CricketTeam("India", "IN","MS Dhoni");
        adapter.add(india);
        CricketTeam aus = new CricketTeam("Australia", "AUS","Michael Clarke");
        adapter.add(aus);
        CricketTeam srilanka= new CricketTeam("Srilanka", "SL","Kumara Sangakara");
        adapter.add(srilanka);
        CricketTeam eng = new CricketTeam("England", "ENG","Ion Morgan");
        adapter.add(eng);
        CricketTeam sa= new CricketTeam("South Africa", "SA","AB De Villiers");
        adapter.add(sa);
    }
}
