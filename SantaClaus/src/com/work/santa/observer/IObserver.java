package com.work.santa.observer;

public interface IObserver {
    void update(final String toy);
    void setTopic(IObservable topic);
}