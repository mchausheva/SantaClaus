package com.work.santa.observer;

import java.util.LinkedList;
import java.util.List;

public class MagicBoard implements IObservable {

    private static MagicBoard instance;
    private final List<IObserver> subscribers = new LinkedList<>();
    private String state;

    private MagicBoard() {
    }

    public static MagicBoard getInstance() {
        if (instance == null) {
            instance = new MagicBoard();
        }
        return instance;
    }

    @Override
    public void subscribe(final IObserver IObserver) {
        if(subscribers.contains(IObserver)){
            return;
        }
        subscribers.add(IObserver);
    }

    @Override
    public void unsubscribe(final IObserver IObserver) {
        subscribers.remove(IObserver);
    }

    @Override
    public void notifyObservers() {
        for (final IObserver subscriber : subscribers) {
            subscriber.update(state);
        }
    }

    @Override
    public void requestToy(final String toy) {
        this.state = toy;
        notifyObservers();
    }

}