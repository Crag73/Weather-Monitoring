package com.example.weathermonitoring;

public class WeatherData {
    private String city;
    private String main;
    private double temp;
    private double feelsLike;
    private long dt;

    public WeatherData(String city, String main, double temp, double feelsLike, long dt) {
        this.city = city;
        this.main = main;
        this.temp = temp;
        this.feelsLike = feelsLike;
        this.dt = dt;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getMain() {
        return main;
    }

    public void setMain(String main) {
        this.main = main;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public double getFeelsLike() {
        return feelsLike;
    }

    public void setFeelsLike(double feelsLike) {
        this.feelsLike = feelsLike;
    }

    public long getDt() {
        return dt;
    }

    public void setDt(long dt) {
        this.dt = dt;
    }
}
