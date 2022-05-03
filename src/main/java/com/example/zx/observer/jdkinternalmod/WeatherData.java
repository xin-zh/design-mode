package com.example.zx.observer.jdkinternalmod;

import com.example.zx.observer.weather.CurrentCondition;

import java.util.Observable;

/**
 * 使用java内置的观察者模式来处理多个观察者需要接收同一个消息的情况
 */
public class WeatherData extends Observable {
    private float mTemperature;
    private float mPressure;
    private float mHumidity;

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
        //表示数据有更新
        this.setChanged();
        //通知观察者发生了数据变更，让观察者自己来拉取数据
//        this.notifyObservers();
        //将数据直接通过参数通知到观察者
        this.notifyObservers(new Data(getmTemperature(),getmPressure(),getmHumidity()));
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

    public class Data{
        public float mTemperature;
        public float mPressure;
        public float mHumidity;

        public Data(float mTemperature, float mPressure, float mHumidity) {
            this.mTemperature = mTemperature;
            this.mPressure = mPressure;
            this.mHumidity = mHumidity;
        }
    }
}
