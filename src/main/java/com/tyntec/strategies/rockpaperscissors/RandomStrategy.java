package com.tyntec.strategies.rockpaperscissors;

import com.tyntec.move.IMove;
import com.tyntec.move.rockpaperscissors.MoveEnum;
import com.tyntec.move.rockpaperscissors.RockPaperScissorsMove;
import com.tyntec.strategies.IPlayStrategy;

import java.util.Random;

public class RandomStrategy implements IPlayStrategy {
    private final Random rn = new Random();

    @Override
    public IMove getMove() {
        switch (getRandomValueFromOneToThree()) {
            case 1:
                return new RockPaperScissorsMove(MoveEnum.PAPER);
            case 2:
                return new RockPaperScissorsMove(MoveEnum.ROCK);
            default:
                return new RockPaperScissorsMove(MoveEnum.SCISSORS);
        }
    }

    private int getRandomValueFromOneToThree() {
        return rn.nextInt(3) + 1;
    }
}
