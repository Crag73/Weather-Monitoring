package com.example.weathermonitoring;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AlertServiceTest {
    @Test
    public void testCheckThresholds() {
        WeatherData weatherData = new WeatherData("Delhi","Clear", 38, 35, 1627640400);
        AlertService alertService = new AlertService();
        assertTrue(alertService.checkThresholds(weatherData));
    }

    @Test
    public void testTriggerAlert() {
        WeatherData weatherData = new WeatherData("Delhi","Clear", 38, 35, 1627640400);
        AlertService alertService = new AlertService();
        alertService.triggerAlert(weatherData);
        // Verify alert (check console output or mock email system)
    }
}
