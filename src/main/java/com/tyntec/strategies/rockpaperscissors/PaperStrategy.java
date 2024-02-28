package com.tyntec.strategies.rockpaperscissors;

import com.tyntec.move.IMove;
import com.tyntec.move.rockpaperscissors.MoveEnum;
import com.tyntec.move.rockpaperscissors.RockPaperScissorsMove;
import com.tyntec.strategies.IPlayStrategy;

public class PaperStrategy implements IPlayStrategy {

    @Override
    public IMove getMove() {
        return new RockPaperScissorsMove(MoveEnum.PAPER);
    }
}
