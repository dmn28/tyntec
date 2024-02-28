package com.tyntec;

import com.tyntec.games.GameResult;
import com.tyntec.games.Game;
import com.tyntec.player.Player;
import com.tyntec.round.Round;
import com.tyntec.rules.IRules;
import com.tyntec.rules.rockpaperscissors.RockPaperScissorsRules;
import com.tyntec.strategies.rockpaperscissors.PaperStrategy;
import com.tyntec.strategies.rockpaperscissors.RandomStrategy;

public class Application {

    public static final int NUMBER_OF_ROUNDS = 100;

    public static void main(String[] args){
        IRules rules = new RockPaperScissorsRules();
        Round round = new Round(rules);
        Player playerA = new Player(new PaperStrategy());
        Player playerB = new Player(new RandomStrategy());
        Game game = new Game(playerA,playerB,new GameResult(),round);

        GameResult gameResult = game.play(NUMBER_OF_ROUNDS);
        System.out.println("Player A wins " + gameResult.getPlayerA_wins_total() + " of " + NUMBER_OF_ROUNDS + " games");
        System.out.println("Player B wins " + gameResult.getPlayerB_wins_total() + " of " + NUMBER_OF_ROUNDS + " games");
        System.out.println("Tie " + gameResult.getTies_total() + " of " + NUMBER_OF_ROUNDS + " games");
    }
}
