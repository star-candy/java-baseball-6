package view;

import constants.Description;
import java.util.List;

public class OutputView {

    public void gameStart() {
        System.out.printf(Description.GAME_START.getMessage());
    }

    public void gameResult(List<Integer> gameCount) {
        if (gameCount.get(0) == 0 && gameCount.get(1) == 0) {
            System.out.println(Description.NOT_COUNT.getMessage());
        }
        if (gameCount.get(0) == 0 && gameCount.get(1) != 0) {
            System.out.printf(Description.BALL_COUNT.getMessage(), gameCount.get(1));
        }
        if (gameCount.get(0) != 0 && gameCount.get(1) != 0) {
            System.out.printf(Description.BALL_STRIKE_COUNT.getMessage(), gameCount.get(0), gameCount.get(1));
        }
        if (gameCount.get(0) != 0 && gameCount.get(0) < 3) {
            System.out.printf(Description.STRIKE_COUNT.getMessage(), gameCount.get(0));
        }
    }

}
