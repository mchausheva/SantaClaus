package com.work.santa.command;

import com.work.santa.observer.MagicBoard;

public class MakeBikeICommand implements ICommand {
    @Override
    public void makeToy() {
        MagicBoard.getInstance().requestToy("Bike");
    }
}