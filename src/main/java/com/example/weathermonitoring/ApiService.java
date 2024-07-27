package com.example.weathermonitoring;

import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

import org.json.JSONObject;

public class ApiService {
    private final String apiKey;

    public ApiService(String apiKey) {
        this.apiKey = apiKey;
    }

    public WeatherData fetchWeatherData(String city) {
        String endpoint = String.format("https://api.openweathermap.org/data/2.5/weather?q=%s&appid=%s", city, apiKey);
        try {
            URL url = new URL(endpoint);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            Scanner scanner = new Scanner(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            while (scanner.hasNext()) {
                response.append(scanner.nextLine());
            }
            scanner.close();

            JSONObject jsonObject = new JSONObject(response.toString());
            return parseWeatherData(city, jsonObject);

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private WeatherData parseWeatherData(String city, JSONObject jsonObject) {
        String main = jsonObject.getJSONArray("weather").getJSONObject(0).getString("main");
        double temp = jsonObject.getJSONObject("main").getDouble("temp");
        double feelsLike = jsonObject.getJSONObject("main").getDouble("feels_like");
        long dt = jsonObject.getLong("dt");

        return new WeatherData(city, main, temp, feelsLike, dt);
    }
}
