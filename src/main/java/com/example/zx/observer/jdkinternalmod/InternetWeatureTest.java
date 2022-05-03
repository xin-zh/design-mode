package com.example.zx.observer.jdkinternalmod;


public class InternetWeatureTest {

    public static void main(String[] args) {
        CurrentCondition currentCondition;
        FocastCondition focastCondition;
        WeatherData weatherData;

        currentCondition=new CurrentCondition();
        focastCondition=new FocastCondition();
        weatherData=new WeatherData();

        weatherData.addObserver(currentCondition);
        weatherData.addObserver(focastCondition);
        weatherData.setData(10,20,60);
    }
}
