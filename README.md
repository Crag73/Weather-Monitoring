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

## Test Cases

### 1. System Setup
- **Objective**: Verify that the system starts successfully and connects to the OpenWeatherMap API using a valid API key.
- **Test**: Ensure the application initializes without errors and confirms connectivity to the API.

### 2. Data Retrieval
- **Objective**: Simulate API calls at configurable intervals and ensure the system retrieves weather data correctly.
- **Test**: Verify that weather data for the specified locations is correctly fetched and parsed from the API response.

### 3. Temperature Conversion
- **Objective**: Test conversion of temperature values from Kelvin to Celsius (or Fahrenheit) based on user preference.
- **Test**: Confirm that temperature values are accurately converted and reflected in the system.

### 4. Daily Weather Summary
- **Objective**: Simulate a sequence of weather updates over several days and verify daily summaries.
- **Test**: Ensure that daily summaries include accurate calculations of average, maximum, and minimum temperatures, as well as the dominant weather condition.

### 5. Alerting Thresholds
- **Objective**: Define and configure user thresholds for temperature or weather conditions and verify alerting.
- **Test**: Simulate weather data that exceeds or breaches the defined thresholds and check if alerts are correctly triggered.

### 6. Visualizations
- **Objective**: Test the generation and display of visualizations for daily weather summaries, historical trends, and triggered alerts.
- **Test**: Ensure that visualizations are correctly generated and reflect the underlying data accurately.

