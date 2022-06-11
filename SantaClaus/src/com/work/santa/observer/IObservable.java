package com.work.santa.observer;


public interface IObservable {

    void subscribe(IObserver IObserver);
    void unsubscribe(IObserver IObserver);

    void notifyObservers();

    void requestToy(String toy);
}