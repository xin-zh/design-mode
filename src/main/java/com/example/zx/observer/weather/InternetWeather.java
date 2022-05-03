package com.example.zx.observer.weather;

public class InternetWeather {
    public static void main(String[] args) {
        CurrentCondition currentCondition;
        WeatherData weatherData;
        currentCondition=new CurrentCondition();
        weatherData=new WeatherData(currentCondition);
        weatherData.setData(30,20,50);
    }
}
