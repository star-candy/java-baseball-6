package exception;

import constants.Description;

public class GameException {

    private final int inputValue;

    public GameException(int inputValue) {
        this.inputValue = inputValue;
        gameManager();
    }

    private void gameManager() {
        longInput();
        sameInput();
        improperInput();
    }

    private void longInput() {

        String numberString = String.valueOf(inputValue);
        if (numberString.length() > 3) {
            throw new IllegalArgumentException();
        }
    }

    private void sameInput() {
        String numberString = String.valueOf(inputValue);
        char firstDigit = numberString.charAt(0);
        char secondDigit = numberString.charAt(1);
        char thirdDigit = numberString.charAt(2);
        if (firstDigit == secondDigit || secondDigit == thirdDigit || firstDigit == thirdDigit) {
            System.out.println(Description.SAME_INPUT.getMessage());
            throw new IllegalArgumentException();
        }
    }


    private void improperInput() {
        try {
            String numberString = String.valueOf(inputValue);
            char firstDigit = numberString.charAt(0);
            char secondDigit = numberString.charAt(1);
            char thirdDigit = numberString.charAt(2);
            if (firstDigit == '0' || secondDigit == '0' || thirdDigit == '0') {
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException e) {
            System.out.println(Description.LONG_INPUT.getMessage());
        }
    }

}
