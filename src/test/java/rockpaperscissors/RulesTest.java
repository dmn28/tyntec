package rockpaperscissors;

import com.tyntec.move.IMove;
import com.tyntec.round.RoundResultEnum;
import com.tyntec.move.rockpaperscissors.MoveEnum;
import com.tyntec.move.rockpaperscissors.RockPaperScissorsMove;
import com.tyntec.rules.IRules;
import com.tyntec.rules.rockpaperscissors.RockPaperScissorsRules;
import org.junit.Assert;
import org.junit.Test;

public class RulesTest {

    @Test
    public void rockBeatsScissorsTest() {
        IMove rock = new RockPaperScissorsMove(MoveEnum.ROCK);
        IMove scissorsMove = new RockPaperScissorsMove(MoveEnum.SCISSORS);
        IRules rules = new RockPaperScissorsRules();

        Assert.assertEquals(RoundResultEnum.WIN_PLAYER_A, rules.getWinner(rock, scissorsMove));
    }

    @Test
    public void scissorsBeatsPaperTest() {
        IMove scissors = new RockPaperScissorsMove(MoveEnum.SCISSORS);
        IMove paperMove = new RockPaperScissorsMove(MoveEnum.PAPER);
        IRules rules = new RockPaperScissorsRules();

        Assert.assertEquals(RoundResultEnum.WIN_PLAYER_A, rules.getWinner(scissors, paperMove));
    }

    @Test
    public void paperBeatsRockTest() {
        IMove paper = new RockPaperScissorsMove(MoveEnum.PAPER);
        IMove rockMove = new RockPaperScissorsMove(MoveEnum.ROCK);
        IRules rules = new RockPaperScissorsRules();

        Assert.assertEquals(RoundResultEnum.WIN_PLAYER_A, rules.getWinner(paper, rockMove));
    }

    @Test
    public void bothChooseRockTest() {
        IMove rock = new RockPaperScissorsMove(MoveEnum.ROCK);
        IMove rockMove = new RockPaperScissorsMove(MoveEnum.ROCK);
        IRules rules = new RockPaperScissorsRules();

        Assert.assertEquals(RoundResultEnum.TIE, rules.getWinner(rock, rockMove));
    }

    @Test
    public void bothChoosePaperTest() {
        IMove paperPlayerA = new RockPaperScissorsMove(MoveEnum.PAPER);
        IMove paperPlayerB = new RockPaperScissorsMove(MoveEnum.PAPER);
        IRules rules = new RockPaperScissorsRules();

        Assert.assertEquals(RoundResultEnum.TIE, rules.getWinner(paperPlayerA, paperPlayerB));
    }

    @Test
    public void bothChooseScissorsTest() {
        IMove scissorsPlayerA = new RockPaperScissorsMove(MoveEnum.SCISSORS);
        IMove scissorsPlayerB = new RockPaperScissorsMove(MoveEnum.SCISSORS);
        IRules rules = new RockPaperScissorsRules();

        Assert.assertEquals(RoundResultEnum.TIE, rules.getWinner(scissorsPlayerA, scissorsPlayerB));
    }
}
