package com.example.weathermonitoring;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ApiServiceTest {
    @Test
    public void testFetchWeatherData() {
        ApiService apiService = new ApiService("YOUR_API_KEY");
        WeatherData weatherData = apiService.fetchWeatherData("Delhi");
        assertNotNull(weatherData);
        assertEquals("Delhi", weatherData.getCity());
    }
}
