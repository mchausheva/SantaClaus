package com.work.santa.factory;

import com.work.santa.model.Doll;
import com.work.santa.model.IToy;

public class DollFactory extends AbstractFactory {

    @Override
    public IToy build() {
        return new Doll();
    }
}