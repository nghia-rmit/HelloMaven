package com.hellomaven;

import com.google.gson.Gson;

public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        String json = "{\"brand\":\"Jeep\", \"doors\": 3}";
        Gson gson = new Gson();
        Car car = gson.fromJson(json, Car.class);
        System.out.println(car);
    }
}
