package model;

import java.util.ArrayList;
import java.util.List;

public class ValidateGameResult {
    private final List<Integer> gameCount = new ArrayList<>();
    private final List<Integer> inputNumber;
    private final List<Integer> answerNumber;

    public ValidateGameResult(List<Integer> inputNumber, List<Integer> answerNumber) {
        this.inputNumber = inputNumber;
        this.answerNumber = answerNumber;
    }

    public List<Integer> validateResult() {
        int strike = 0, ball = 0;
        for (int i = 0; i < answerNumber.size(); i++) {
            if (answerNumber.get(i).equals(inputNumber.get(i))) {
                strike++;
            }
        }
        for (Integer num : inputNumber) {
            if (answerNumber.contains(num) && !num.equals(inputNumber.get(answerNumber.indexOf(num)))) {
                ball++;
            }
        }
        gameCount.add(strike);
        gameCount.add(ball);
        return gameCount;
    }
}

