package com.example.weathermonitoring;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WeatherStorage {
    private Map<String, List<WeatherData>> dailyData;

    public WeatherStorage() {
        dailyData = new HashMap<>();
    }

    public void storeData(WeatherData weatherData) {
        String date = getDate(weatherData.getDt());
        dailyData.putIfAbsent(date, new ArrayList<>());
        dailyData.get(date).add(weatherData);
    }

    public List<WeatherData> getDailyData(String date) {
        return dailyData.getOrDefault(date, new ArrayList<>());
    }

    public List<String> getStoredDates() {
        return new ArrayList<>(dailyData.keySet());
    }

    private String getDate(long timestamp) {
        // Convert Unix timestamp to date string (e.g., YYYY-MM-DD)
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd");
        java.util.Date date= new java.util.Date(timestamp * 1000);
        return sdf.format(date);
        }
        }
