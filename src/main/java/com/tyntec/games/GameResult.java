package com.tyntec.games;

import com.tyntec.round.RoundResultEnum;

public class GameResult {
    private int playerA_wins_total;
    private int playerB_wins_total;
    private int ties_total;

    public void addRoundResult(RoundResultEnum roundResult){
        if(roundResult == RoundResultEnum.WIN_PLAYER_A){
            playerA_wins_total++;
        } else if (roundResult == RoundResultEnum.WIN_PLAYER_B) {
            playerB_wins_total++;
        }else{
            ties_total++;
        }
    }

    public int getPlayerA_wins_total() {
        return playerA_wins_total;
    }

    public int getPlayerB_wins_total() {
        return playerB_wins_total;
    }

    public int getTies_total() {
        return ties_total;
    }
}
