package com.work.santa;

import com.work.santa.observer.Dwarf;
import com.work.santa.observer.MagicBoard;
import com.work.santa.singleton.SantaClaus;
import com.work.santa.singleton.Workshop;

public class Main {
    public static void main(String[] args) {
        final SantaClaus santaClaus = SantaClaus.getInstance();
        final MagicBoard magicBoard = MagicBoard.getInstance();

        final Dwarf dwarf1 = new Dwarf();
        final Dwarf dwarf2 = new Dwarf();
        final Dwarf dwarf3 = new Dwarf();
        final Dwarf dwarf4 = new Dwarf();

        magicBoard.subscribe(dwarf1);
        magicBoard.subscribe(dwarf2);
        magicBoard.subscribe(dwarf3);
        magicBoard.subscribe(dwarf4);

        santaClaus.makeToys();

        System.out.printf("Created toys: %s%n", Workshop.getInstance().getToysCreated());
    }
}
