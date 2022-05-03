package com.example.zx.observer.weather;

public class CurrentCondition {
    private float mTemperature;

    private float mPressure;

    private float mHumidity;

    public void update(float mTemperature,float mPressure,float mHumidity){
        this.mHumidity=mHumidity;
        this.mTemperature=mTemperature;
        this.mPressure=mPressure;
        display();
    }

    public void display(){
        System.out.println("温度："+this.mTemperature);
        System.out.println("气压："+this.mPressure);
        System.out.println("湿度："+this.mHumidity);
    }

}
