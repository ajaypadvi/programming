package designpatterns.observer.weather_observable.app;

import designpatterns.observer.weather_observable.CurrentConditionsDisplay;
import designpatterns.observer.weather_observable.ForecastDisplay;
import designpatterns.observer.weather_observable.StatisticsDisplay;
import designpatterns.observer.weather_observable.WeatherData;

public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditions = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        System.out.println("---------------------------------------------------");
        weatherData.setMeasurements(80, 65, 30.4f);
        System.out.println("---------------------------------------------------");
        weatherData.setMeasurements(82, 70, 29.2f);
        System.out.println("---------------------------------------------------");
        weatherData.setMeasurements(78, 90, 29.2f);
        System.out.println("---------------------------------------------------");
    }
}
