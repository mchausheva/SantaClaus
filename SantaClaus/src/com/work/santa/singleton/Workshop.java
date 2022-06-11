package com.work.santa.singleton;

public class Workshop {
    private static Workshop instance;
    private int toysCreated = 0;

    private Workshop() {
    }

    public static Workshop getInstance() {
        if (instance == null) {
            instance = new Workshop();
        }
        return instance;
    }


    public void addToyToStorage() {
        toysCreated +=1;
    }

    public int getToysCreated() {
        return toysCreated;
    }
}