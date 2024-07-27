package com.example.weathermonitoring;

import java.util.List;

public class WeatherSummary {
    private double avgTemp;
    private double maxTemp;
    private double minTemp;
    private String dominantWeather;

    public WeatherSummary(List<WeatherData> weatherDataList) {
        calculateSummary(weatherDataList);
    }

    private void calculateSummary(List<WeatherData> weatherDataList) {
        double totalTemp = 0;
        double maxTemp = Double.MIN_VALUE;
        double minTemp = Double.MAX_VALUE;
        int[] conditionCount = new int[WeatherCondition.values().length];

        for (WeatherData data : weatherDataList) {
            double temp = data.getTemp();
            totalTemp += temp;
            if (temp > maxTemp) {
                maxTemp = temp;
            }
            if (temp < minTemp) {
                minTemp = temp;
            }

            WeatherCondition condition = WeatherCondition.valueOf(data.getMain().toUpperCase());
            conditionCount[condition.ordinal()]++;
        }

        this.avgTemp = totalTemp / weatherDataList.size();
        this.maxTemp = maxTemp;
        this.minTemp = minTemp;
        this.dominantWeather = WeatherCondition.values()[maxIndex(conditionCount)].toString();
    }

    private int maxIndex(int[] array) {
        int maxIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    // Getters and toString() method

    public double getAvgTemp() {
        return avgTemp;
    }

    public double getMaxTemp() {
        return maxTemp;
    }

    public double getMinTemp() {
        return minTemp;
    }

    public String getDominantWeather() {
        return dominantWeather;
    }

    @Override
    public String toString() {
        return "WeatherSummary{" +
                "avgTemp=" + avgTemp +
                ", maxTemp=" + maxTemp +
                ", minTemp=" + minTemp +
                ", dominantWeather='" + dominantWeather + '\'' +
                '}';
    }
}
