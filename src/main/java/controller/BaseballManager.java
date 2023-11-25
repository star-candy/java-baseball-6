package controller;

import java.util.List;
import model.AnswerCreator;
import model.IntListConverter;
import model.ValidateGameResult;
import view.InputView;
import view.OutputView;

public class BaseballManager {
    private int restartNumber = 0;
    private int strikeCount = 0;
    private List<Integer> gameCount;

    public void gameStart() {
        OutputView outputView = new OutputView();
        outputView.gameStart();
        while (restartNumber == 1) {
            InputView inputView = new InputView();
            AnswerCreator answerCreator = new AnswerCreator();
            IntListConverter intListConverter = new IntListConverter();
            List<Integer> answer = answerCreator.createAnswer();

            while (strikeCount != 3) {
                List<Integer> inputNumber = intListConverter.intToList(inputView.ballNumber());
                ValidateGameResult validateGameResult = new ValidateGameResult(inputNumber, answer);
                gameCount = validateGameResult.validateResult();
                strikeCount = gameCount.get(0);
            }
            outputView.gameResult(gameCount);
            restartNumber = inputView.restartOrEnd();
        }


    }
}


