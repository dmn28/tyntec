package rockpaperscissors;

import com.tyntec.move.rockpaperscissors.MoveEnum;
import com.tyntec.move.rockpaperscissors.RockPaperScissorsMove;
import com.tyntec.strategies.IPlayStrategy;
import com.tyntec.strategies.rockpaperscissors.PaperStrategy;
import com.tyntec.strategies.rockpaperscissors.RandomStrategy;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class StrategiesTest {

    @Test
    public void PaperStrategyTest() {
        IPlayStrategy strategy = new PaperStrategy();
        Assert.assertEquals(((RockPaperScissorsMove) strategy.getMove()).getMove(), MoveEnum.PAPER);
    }

    @Test
    public void RandomStrategyTest() {
        IPlayStrategy strategy = new RandomStrategy();
        Map<Integer, Integer> map = new HashMap<Integer, Integer>(3);
        map.put(1, 0);
        map.put(2, 0);
        map.put(3, 0);
        int N = 1000000;
        for (int i = 0; i < N; i++) {
            MoveEnum move = ((RockPaperScissorsMove) strategy.getMove()).getMove();
            if (move == MoveEnum.PAPER) {
                map.put(1, map.get(1) + 1);
            } else if (move == MoveEnum.ROCK) {
                map.put(2, map.get(2) + 1);
            } else {
                map.put(3, map.get(3) + 1);
            }
        }
        for (int i = 1; i < 4; i++) {
            Assert.assertTrue(map.get(i) > N * 0.3);
        }
    }
}
