package com.example.weathermonitoring;

public class WeatherVisualizer {
    public void visualizeData(WeatherStorage weatherStorage) {
        for (String date : weatherStorage.getStoredDates()) {
            WeatherSummary summary = new WeatherSummary(weatherStorage.getDailyData(date));
            System.out.println("Date: " + date);
            System.out.println(summary);
        }
    }
}
