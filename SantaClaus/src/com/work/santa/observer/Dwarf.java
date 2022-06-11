package com.work.santa.observer;

import com.work.santa.factory.AbstractFactory;
import com.work.santa.factory.BikeFactory;
import com.work.santa.factory.DollFactory;
import com.work.santa.model.IToy;
import com.work.santa.singleton.Workshop;


public class Dwarf implements IObserver {
    private IObservable topic;

    @Override
    public void update(final String toy) {
        final AbstractFactory factory;
        switch (toy){
            case "Doll":
                factory = new DollFactory();
                break;
            case "Bike": default:
                factory = new BikeFactory();
                break;
        }

        final IToy builtIToy = factory.build();
        Workshop.getInstance().addToyToStorage();
    }

    @Override
    public void setTopic(IObservable topic) {
        this.topic = topic;
    }

}