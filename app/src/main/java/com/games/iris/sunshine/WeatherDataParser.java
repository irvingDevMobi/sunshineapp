package com.games.iris.sunshine;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Irving
 * @since 10/06/2015
 */
public class WeatherDataParser {

    /**
     * Given a string of the form returned by the api call:
     * http://api.openweathermap.org/data/2.5/forecast/daily?q=94043&mode=json&units=metric&cnt=7
     * retrieve the maximum temperature for the day indicated by dayIndex
     * (Note: 0-indexed, so 0 would refer to the first day).
     */
    public static double getMaxTemperatureForDay(String weatherJsonStr, int dayIndex)
        throws JSONException {
        // TODO: add parsing code here
        JSONObject json = new JSONObject(weatherJsonStr);
        JSONArray dayList = (JSONArray) json.get("list");
        JSONObject day = (JSONObject) dayList.get(dayIndex);
        JSONObject temps = (JSONObject) day.get("temp");
        return temps.getDouble("max");
    }
}
