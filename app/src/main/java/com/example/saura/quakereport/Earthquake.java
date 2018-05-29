package com.example.saura.quakereport;

/**
 * Created by saura on 5/20/2018.
 */

public class Earthquake {
    //Magnitude of the earthquake

    private String mMagnitude;

    //Location of the earthquake

    private String mLocation;

    //Date of the earthquake
    private String mDate;

    /**
     * Constructs a new earthquake object;
     *@param magnitude is the magnitude of the earthquake
     *@param location is the location  of the earthquake
     *@param  date is the date of the earthquake happened
     *
     */
    public Earthquake(String magnitude,String location,String date)
    {
       mMagnitude = magnitude;

       mLocation = location;

        mDate = date;


    }

    /**
     *
     * @return the magnitude of the earthquake
     */
    public String getMagnitude(){return mMagnitude;}

    /**
     *
     * @return the locaton of the earthquake
     */
    public String getLocation(){return mLocation;}

    /**
     *
     * @return the date of the earthquake happened
     */
    public String getDate(){return mDate;}

}
