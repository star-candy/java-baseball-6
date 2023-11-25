package view;

import camp.nextstep.edu.missionutils.Console;
import constants.Description;
import exception.GameException;

public class InputView {

    public int ballNumber() {
        int inputNumber = 0;
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
}
