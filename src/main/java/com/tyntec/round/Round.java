package com.tyntec.round;

import com.tyntec.move.IMove;
import com.tyntec.rules.IRules;

public class Round {

    private IRules rules;

    public Round(IRules rules){
        this.rules = rules;
    }

    public RoundResultEnum playRound(IMove movePlayerA, IMove movePlayerB){
        return rules.getWinner(movePlayerA, movePlayerB);
    }
}
