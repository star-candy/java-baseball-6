package model;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;

public class AnswerCreator {
    private final List<Integer> answer = new ArrayList<>();

    public List<Integer> createAnswer() {
        int expectedAnswer = Randoms.pickNumberInRange(1, 9);
        answer.add(expectedAnswer);

        while (answer.size() < 3) {
            expectedAnswer = Randoms.pickNumberInRange(1, 9);
            for (Integer integer : answer) {
                if (integer.equals(expectedAnswer)) {
                    break;
                }
            }
            answer.add(expectedAnswer);
        }
        return answer;
    }
}
