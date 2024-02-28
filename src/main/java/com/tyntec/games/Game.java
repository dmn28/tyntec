package com.tyntec.games;

import com.tyntec.player.Player;
import com.tyntec.round.Round;

public class Game {

    private final Player playerA;
    private final Player playerB;
    private final GameResult gameResult;
    private final Round round;

    public Game(Player playerA, Player playerB, GameResult gameResult, Round round) {
        this.playerA = playerA;
        this.playerB = playerB;
        this.gameResult = gameResult;
        this.round = round;
    }

    public GameResult play(int numberOfRounds) {
        for (int i = 0; i < numberOfRounds; i++) {
            gameResult.addRoundResult(round.playRound(playerA.getMove(), playerB.getMove()));
        }
        return gameResult;
    }
}
