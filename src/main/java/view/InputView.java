package view;

import camp.nextstep.edu.missionutils.Console;
import constants.Description;
import exception.GameException;
import exception.RestartException;

public class InputView {

    public int ballNumber() {
        int inputNumber;
        try {
            System.out.printf(Description.INPUT_NUMBER.getMessage());
            inputNumber = Integer.parseInt(Console.readLine());
            new GameException(inputNumber);
            return inputNumber;
        } catch (IllegalArgumentException e) {
            System.out.println(Description.NOT_NUMBER.getMessage());
            return ballNumber();
        }
    }

    public int restartOrEnd() {
        int inputNumber;
        try {
            System.out.printf(Description.RESTART_COUNT.getMessage());
            inputNumber = Integer.parseInt(Console.readLine());
            new RestartException(inputNumber);
            return inputNumber;
        } catch (IllegalArgumentException e) {
            System.out.println(Description.NOT_NUMBER.getMessage());
            return restartOrEnd();
        }
    }
}
