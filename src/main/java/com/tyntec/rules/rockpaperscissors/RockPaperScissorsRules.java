package com.tyntec.rules.rockpaperscissors;

import com.tyntec.move.IMove;
import com.tyntec.round.RoundResultEnum;
import com.tyntec.move.rockpaperscissors.MoveEnum;
import com.tyntec.move.rockpaperscissors.RockPaperScissorsMove;
import com.tyntec.rules.IRules;

public class RockPaperScissorsRules implements IRules {

    @Override
    public RoundResultEnum getWinner(IMove movePlayerA, IMove movePlayerB) {
        MoveEnum movePlayerAEnum = ((RockPaperScissorsMove) movePlayerA).getMove();
        MoveEnum movePlayerBEnum = ((RockPaperScissorsMove) movePlayerB).getMove();

        if (movePlayerAEnum == MoveEnum.ROCK && movePlayerBEnum == MoveEnum.SCISSORS) {
            return RoundResultEnum.WIN_PLAYER_A;
        } else if (movePlayerAEnum == MoveEnum.ROCK && movePlayerBEnum == MoveEnum.PAPER) {
            return RoundResultEnum.WIN_PLAYER_B;
        } else if (movePlayerAEnum == MoveEnum.SCISSORS && movePlayerBEnum == MoveEnum.PAPER) {
            return RoundResultEnum.WIN_PLAYER_A;
        } else if (movePlayerAEnum == MoveEnum.SCISSORS && movePlayerBEnum == MoveEnum.ROCK) {
            return RoundResultEnum.WIN_PLAYER_B;
        } else if (movePlayerAEnum == MoveEnum.PAPER && movePlayerBEnum == MoveEnum.ROCK) {
            return RoundResultEnum.WIN_PLAYER_A;
        } else if (movePlayerAEnum == MoveEnum.PAPER && movePlayerBEnum == MoveEnum.SCISSORS) {
            return RoundResultEnum.WIN_PLAYER_B;
        } else {
            return RoundResultEnum.TIE;
        }
    }
}
