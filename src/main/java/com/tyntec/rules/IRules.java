package com.tyntec.rules;

import com.tyntec.move.IMove;
import com.tyntec.round.RoundResultEnum;

public interface IRules {
    RoundResultEnum getWinner(IMove movePlayerA, IMove movePlayerB);
}
