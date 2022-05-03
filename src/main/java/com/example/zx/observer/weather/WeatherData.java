package com.example.zx.observer.weather;

public class WeatherData {
    private float mTemperature;

    private float mPressure;

    private float mHumidity;

    private CurrentCondition mCurrentCondition;

    public float getmTemperature() {
        return mTemperature;
    }

//    public void setmTemperature(float mTemperature) {
//        this.mTemperature = mTemperature;
//    }

    public float getmPressure() {
        return mPressure;
    }

//    public void setmPressure(float mPressure) {
//        this.mPressure = mPressure;
//    }

    public float getmHumidity() {
        return mHumidity;
    }

//    public void setmHumidity(float mHumidity) {
//        this.mHumidity = mHumidity;
//    }

    public WeatherData(CurrentCondition mCurrentCondition){
        this.mCurrentCondition=mCurrentCondition;
    }

    public void dataChange(){
        mCurrentCondition.update(getmTemperature(),getmPressure(),getmHumidity());
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
}
