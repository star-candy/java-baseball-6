package exception;

public class RestartException {
    private final int inputValue;

    public RestartException(int inputValue) {
        this.inputValue = inputValue;
        restartManager();
    }

    public void restartManager() {
        // catch에 return input 넣기
    }
}
