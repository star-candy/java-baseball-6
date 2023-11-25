package exception;

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
    }

    private void sameInput() {
    }

    private void improperInput() {
    }

}
