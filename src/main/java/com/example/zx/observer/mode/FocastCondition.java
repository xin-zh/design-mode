package com.example.zx.observer.mode;

public class FocastCondition implements Observer {
    private float mTemperature;
    private float mPressure;
    private float mHumidity;

    @Override
    public void update(float mTemperature, float mPressure, float mHumidity) {
        this.mHumidity=mHumidity;
        this.mTemperature=mTemperature;
        this.mPressure=mPressure;
        display();
    }

    public void display(){
        System.out.println("tomorrow mTemperature："+this.mTemperature);
        System.out.println("tomorrow mPressure："+this.mPressure);
        System.out.println("tomorrow mHumidity："+this.mHumidity);
    }
}
