package com.example.saura.quakereport;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by saura on 5/20/2018.
 */

public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {


    public EarthquakeAdapter(Context context, List<Earthquake> earthquakes)
    {

        super(context,0,earthquakes);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

    View listItemView = convertView;
        if(listItemView == null)
        {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.earthquake_list_item,parent,false);

        }

        Earthquake currentEarthquake = getItem(position);

        TextView magnitudeView = (TextView)listItemView.findViewById(R.id.magnitude);
        magnitudeView.setText(currentEarthquake.getMagnitude());

        TextView locationView = (TextView)listItemView.findViewById(R.id.location);
        locationView.setText(currentEarthquake.getLocation());

        TextView dateView = (TextView)listItemView.findViewById(R.id.date);
        dateView.setText(currentEarthquake.getDate());

        return listItemView;

    }
}
