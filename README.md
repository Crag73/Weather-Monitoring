# Real-Time Weather Monitoring System

This project is a real-time weather monitoring system that continuously retrieves weather data from the OpenWeatherMap API, processes it, and provides summarized insights with rollups and aggregates. It includes features for alerting and visualizations of weather data.

## Features

- **Real-Time Data Retrieval**: Fetches weather data for cities from the OpenWeatherMap API at configurable intervals.
- **Data Processing**: Converts temperature values from Kelvin to Celsius, calculates daily weather summaries, and tracks alerting thresholds.
- **Alerting**: Triggers alerts when specific thresholds are breached (e.g., temperature exceeds 35°C).
- **Visualizations**: Displays daily weather summaries, historical trends, and triggered alerts (implementation details can be expanded based on requirements).

## Getting Started

To get started with the project, follow these steps:

1. **Clone the Repository**:

   git clone https://github.com/yourusername/real-time-weather-monitoring.git
   cd real-time-weather-monitoring

2. **Update API Key**:

    Open src/main/java/com/example/weathermonitoring/Main.java in your preferred text editor.
    Find the line with String apiKey = "YOUR_API_KEY"; and replace "YOUR_API_KEY" with your actual OpenWeatherMap API key.


3. **Build the Project**:

    mvn clean package

4. **Run the Application**:

    Use the following Maven command to start the application:
    mvn exec:java -Dexec.mainClass=com.example.weathermonitoring.Main

5. **Running Tests**:

    mvn test

## Configuration

    Polling Interval: Configure the interval for fetching weather data in the ApiService class or through application settings.
    Alert Thresholds: Define and adjust alert thresholds within the code or application settings.

## Directory Structure
src
├── main
│   └── java
│       └── com
│           └── example
│               └── weathermonitoring
│                   ├── Main.java
│                   ├── ApiService.java
│                   ├── WeatherData.java
│                   └── WeatherCondition.java
└── test
    └── java
        └── com
            └── example
                └── weathermonitoring
                    └── ApiServiceTest.java
