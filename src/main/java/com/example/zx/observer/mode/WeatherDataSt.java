package com.example.zx.observer.mode;

import com.example.zx.observer.weather.CurrentCondition;

import java.util.ArrayList;
import java.util.List;

public class WeatherDataSt implements Subject{
    private float mTemperature;

    private float mPressure;

    private float mHumidity;

    private List<Observer> mObservers;

    public  WeatherDataSt(){
        mObservers=new ArrayList<>();
    }

    public float getmTemperature() {
        return mTemperature;
    }

    public float getmPressure() {
        return mPressure;
    }

    public float getmHumidity() {
        return mHumidity;
    }

    public void dataChange(){
        notifyObservers();
    }

    /**
     * mock数据
     * @param mTemperature
     * @param mPressure
     * @param mHumidity
     */
    public void setData(float mTemperature,float mPressure,float mHumidity){
        this.mHumidity=mHumidity;
        this.mTemperature=mTemperature;
        this.mPressure=mPressure;
        dataChange();
    }

    @Override
    public void registerObserver(Observer o) {
        mObservers.add(o);
    }

    @Override
    public void removeRegister(Observer o) {
        if (mObservers.contains(o)) {
            mObservers.remove(o);
        }
    }

    @Override
    public void notifyObservers() {
        mObservers.stream().forEach(o->o.update(getmTemperature(),getmPressure(),getmHumidity()));
    }
}
