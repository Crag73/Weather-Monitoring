package com.example.weathermonitoring;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DataProcessorTest {
    @Test
    public void testProcessData() {
        WeatherData weatherData = new WeatherData("Delhi","Clear", 300, 295, 1627640400);
        DataProcessor dataProcessor = new DataProcessor();
        dataProcessor.processData(weatherData);
        assertEquals(26.85, weatherData.getTemp(), 0.01);
        assertEquals(21.85, weatherData.getFeelsLike(), 0.01);
    }
}
