package com.example.zx.observer.jdkinternalmod;


import java.util.Observable;
import java.util.Observer;

public class FocastCondition implements Observer {
    private float mTemperature;
    private float mPressure;
    private float mHumidity;

    public FocastCondition(){}

    public void display(){
        System.out.println("Tomorrow mTemperature："+this.mTemperature);
        System.out.println("Tomorrow mPressure："+this.mPressure);
        System.out.println("Tomorrow mHumidity："+this.mHumidity);
    }

    @Override
    public void update(Observable o, Object arg) {
        this.mHumidity=((WeatherData.Data)(arg)).mHumidity;
        this.mTemperature=((WeatherData.Data)(arg)).mTemperature;
        this.mPressure=((WeatherData.Data)(arg)).mPressure;
        display();
    }
}
