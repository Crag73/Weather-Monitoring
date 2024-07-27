package com.example.weathermonitoring;

import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) {
        String apiKey = "YOUR_API_KEY";
        String[] cities = {"Delhi", "Mumbai", "Chennai", "Bangalore", "Kolkata", "Hyderabad"};
        
        ApiService apiService = new ApiService(apiKey);
        DataProcessor dataProcessor = new DataProcessor();
        AlertService alertService = new AlertService();
        WeatherStorage weatherStorage = new WeatherStorage();
        WeatherVisualizer weatherVisualizer = new WeatherVisualizer();
        
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                for (String city : cities) {
                    WeatherData weatherData = apiService.fetchWeatherData(city);
                    dataProcessor.processData(weatherData);
                    weatherStorage.storeData(weatherData);
                    weatherVisualizer.visualizeData(weatherStorage);
                    
                    if (alertService.checkThresholds(weatherData)) {
                        alertService.triggerAlert(weatherData);
                    }
                }
            }
        }, 0, 300000); // 5 minutes
    }
}
