package com.example.androidlabs;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CricketAdapter extends ArrayAdapter<CricketTeam> {


    public CricketAdapter(Context context, ArrayList<CricketTeam> teams) {
        super(context, 0, teams);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        CricketTeam team = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.cricket_team_item, parent, false);
        }
        // Lookup view for data population
        TextView TeamName = (TextView) convertView.findViewById(R.id.country);
        TextView Flag = (TextView) convertView.findViewById(R.id.flag);
        TextView Captain = (TextView) convertView.findViewById(R.id.captain);
        // Populate the data into the template view using the data object
        TeamName.setText(team.country);
        Flag.setText(team.flag);
        Captain.setText(team.captain);
        // Return the completed view to render on screen
        return convertView;
    }
}