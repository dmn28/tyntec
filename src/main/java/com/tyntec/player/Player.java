package com.tyntec.player;

import com.tyntec.move.IMove;
import com.tyntec.strategies.IPlayStrategy;

public class Player {

    private final IPlayStrategy strategy;

    public Player(IPlayStrategy strategy) {
        this.strategy = strategy;
    }

    public IMove getMove() {
        return strategy.getMove();
    }
}
