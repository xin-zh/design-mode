package com.example.zx.observer.mode;

public class InternetWeatureTest {

    public static void main(String[] args) {
        Observer currentCondition;
        Observer focastCondition;
        WeatherDataSt weatherDataSt;

        currentCondition=new CurrentCondition();
        focastCondition=new FocastCondition();
        weatherDataSt=new WeatherDataSt();
        weatherDataSt.registerObserver(currentCondition);
        weatherDataSt.registerObserver(focastCondition);
        weatherDataSt.setData(20,50,30);

        System.out.println("=============================");

        weatherDataSt.removeRegister(currentCondition);
        weatherDataSt.setData(10,10,30);
    }
}
