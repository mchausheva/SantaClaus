package com.work.santa.factory;

import com.work.santa.model.Bike;
import com.work.santa.model.IToy;

public class BikeFactory extends AbstractFactory {

    @Override
    public IToy build() {
        return new Bike();
    }
}