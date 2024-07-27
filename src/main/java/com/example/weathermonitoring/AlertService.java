package com.example.weathermonitoring;

import java.util.HashMap;
import java.util.Map;

public class AlertService {
    private Map<String, Double> thresholds;

    public AlertService() {
        thresholds = new HashMap<>();
        thresholds.put("TEMP", 35.0); // Default threshold
    }

    public boolean checkThresholds(WeatherData weatherData) {
        return weatherData.getTemp() > thresholds.get("TEMP");
    }

    public void triggerAlert(WeatherData weatherData) {
        System.out.println("ALERT! Temperature exceeded threshold: " + weatherData.getTemp());
        // Add email notification system if needed
    }

    public void setThreshold(String key, double value) {
        thresholds.put(key, value);
    }
}