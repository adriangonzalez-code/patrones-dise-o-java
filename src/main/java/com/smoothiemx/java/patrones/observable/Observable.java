package com.smoothiemx.java.patrones.observable;

import java.util.ArrayList;
import java.util.List;

public abstract class Observable {

    protected List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void remove(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        notifyObservers(null);
    }

    public void notifyObservers(Object obj) {
        for (Observer obs : observers) {
            obs.update(this, obj);
        }
    }
}