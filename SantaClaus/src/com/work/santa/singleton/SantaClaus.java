package com.work.santa.singleton;

import com.work.santa.command.MakeBikeICommand;
import com.work.santa.command.MakeDollICommand;

public class SantaClaus {

    private static SantaClaus instance;

    private SantaClaus() {
    }

    public static SantaClaus getInstance() {
        if (instance == null) {
            instance = new SantaClaus();
        }
        return instance;
    }

    public void makeToys() {
        makeBikes(50);
        makeDolls(50);
    }

    public void makeBikes(int count) {
        for (int i = 0; i < count; i++) {
            new MakeBikeICommand().makeToy();
        }
    }

    public void makeDolls(int count) {
        for (int i = 0; i < count; i++) {
            new MakeDollICommand().makeToy();
        }
    }
}