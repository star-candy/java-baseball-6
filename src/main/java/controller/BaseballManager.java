package controller;

import java.util.List;
import model.AnswerCreator;
import model.IntListConverter;
import model.ValidateGameResult;
import view.InputView;
import view.OutputView;

public class BaseballManager {
    private int restartNumber = 1;

    private List<Integer> gameCount;

    public void gameStart() {
        OutputView outputView = new OutputView();
        outputView.gameStart();

        while (restartNumber == 1) {
            InputView inputView = new InputView();
            AnswerCreator answerCreator = new AnswerCreator();
            IntListConverter intListConverter = new IntListConverter();
            int strikeCount = 0;
            List<Integer> answer = answerCreator.createAnswer();

            while (strikeCount != 3) {
                List<Integer> inputNumber = intListConverter.intToList(inputView.ballNumber());
                ValidateGameResult validateGameResult = new ValidateGameResult(inputNumber, answer);
                gameCount = validateGameResult.validateResult();
                outputView.gameResult(gameCount);
                strikeCount = gameCount.get(0);
            }
            outputView.gameEnd();
            restartNumber = inputView.restartOrEnd();
        }


    }
}


