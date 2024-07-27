package com.example.weathermonitoring;

public class DataProcessor {
    public void processData(WeatherData weatherData) {
        weatherData.setTemp(weatherData.getTemp() - 273.15);
        weatherData.setFeelsLike(weatherData.getFeelsLike() - 273.15);
    }
}
