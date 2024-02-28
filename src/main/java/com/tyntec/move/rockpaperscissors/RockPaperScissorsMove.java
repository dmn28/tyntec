package com.tyntec.move.rockpaperscissors;

import com.tyntec.move.IMove;

public class RockPaperScissorsMove implements IMove {
    private final MoveEnum move;

    public RockPaperScissorsMove(MoveEnum moveEnum){
        this.move = moveEnum;
    }

    public MoveEnum getMove() {
        return move;
    }
}
