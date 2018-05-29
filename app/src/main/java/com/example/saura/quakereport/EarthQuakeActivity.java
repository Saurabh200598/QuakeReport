package com.example.saura.quakereport;

import android.app.usage.UsageEvents;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class EarthQuakeActivity extends AppCompatActivity {
    /**
     * Sample JSON response for a USGS query
     */
    private static final String SAMPLE_JSON_RESPONSE = "https://earthquake.usgs.gov/fdsnws/event/1/query?format=geojson&starttime=2016-01-01&endtime=2016-01-31&minmag=6&limit=10";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_earth_quake);
        EarthquakeAsyncTask task = new EarthquakeAsyncTask();
        task.execute();

        //creates a list of earthquake
        // ArrayList<Earthquake> earthquakes=QueryUtils.extractEarthquakes();

    }





        class EarthquakeAsyncTask extends AsyncTask<String,Void,List<Earthquake>>
        {

            @Override
            protected List<Earthquake> doInBackground(String... params) {

                URL url = QueryUtils.createUrl(SAMPLE_JSON_RESPONSE);
                String jsonresponse="";
                try{

                    jsonresponse = QueryUtils.makehttpRequest(url);

                }catch(IOException e){

                }
                ArrayList<Earthquake> earthquake = QueryUtils.extractEarthquakes(jsonresponse);
                return earthquake;
            }

            @Override
            protected void onPostExecute(List<Earthquake> earthquakes) {
               // super.onPostExecute(earthquakes);
                ListView earrthquakeListView=(ListView)findViewById(R.id.list);

                EarthquakeAdapter adapter=new EarthquakeAdapter(EarthQuakeActivity.this,earthquakes);

                earrthquakeListView.setAdapter(adapter);
            }
        }


    }



