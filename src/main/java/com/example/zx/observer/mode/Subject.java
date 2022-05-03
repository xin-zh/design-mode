package com.example.zx.observer.mode;

public interface Subject {

    void registerObserver(Observer o);

    void removeRegister(Observer o);

    void notifyObservers();

}
