package exception;

public class GameException {

    private final int inputValue;

    public GameException(int inputValue) {
        this.inputValue = inputValue;
        gameManager();
    }

    public void gameManager() {
        // catch에 return input 넣기
    }

    private void longInput() {
    }

    private void sameInput() {
    }

    private void improperInput() {
    }

}
