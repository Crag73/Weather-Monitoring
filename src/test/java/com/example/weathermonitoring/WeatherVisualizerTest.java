package com.example.weathermonitoring;

import org.junit.jupiter.api.Test;

public class WeatherVisualizerTest {
    @Test
    public void testVisualizeData() {
        WeatherStorage weatherStorage = new WeatherStorage();
        WeatherData weatherData = new WeatherData("Delhi","Clear", 26.85, 21.85, 1627640400);
        weatherStorage.storeData(weatherData);

        WeatherVisualizer weatherVisualizer = new WeatherVisualizer();
        weatherVisualizer.visualizeData(weatherStorage);
        // Verify visualization (check console output or graphical UI)
    }
}
