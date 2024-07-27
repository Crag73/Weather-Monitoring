package com.example.weathermonitoring;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.List;

public class WeatherStorageTest {
    @Test
    public void testStoreData() {
        WeatherStorage weatherStorage = new WeatherStorage();
        WeatherData weatherData = new WeatherData("Delhi","Clear", 26.85, 21.85, 1627640400);
        weatherStorage.storeData(weatherData);
        
        List<WeatherData> data = weatherStorage.getDailyData("2021-07-30");
        assertEquals(1, data.size());
        assertEquals(26.85, data.get(0).getTemp());
    }
}
