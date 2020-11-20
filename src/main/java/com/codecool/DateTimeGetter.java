package com.codecool;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeGetter {

    protected String getDate(){
        Date dNow = new Date( );
        SimpleDateFormat ft =
                new SimpleDateFormat ("yyyy-MM-dd");

        return ft.format(dNow);
    }

    protected String getTime(){
        Date dNow = new Date( );
        SimpleDateFormat ft =
                new SimpleDateFormat ("hh:mm:ss");

        return "'" + ft.format(dNow)+ "'";
    }
}

