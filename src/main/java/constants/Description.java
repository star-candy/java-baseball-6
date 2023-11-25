package constants;

public enum Description {
    GAME_START("숫자 야구 게임을 시작합니다."),
    INPUT_NUMBER("숫자를 입력해주세요 : %d\n"),
    BALL_STRIKE_COUNT("%d볼 %d스트라이크\n"),
    STRIKE_COUNT("%d스트라이크\n"),
    BALL_COUNT("%d볼\n"),
    NOT_COUNT("낫싱"),
    GAME_END("3개의 숫자를 모두 맞히셨습니다! 게임 종료"),
    RESTART_COUNT("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요."),
    LONG_INPUT("[ERROR] 3자리 숫자가 입력되어야 합니다"),
    SAME_INPUT("[ERROR] 동일한 숫자가 입력될 수 없습니다"),
    EXIST_ZERO("[ERROR] 0은 포함될 수 없습니다"),
    IMPROPER_INPUT("[ERROR] 1,2 외의 숫자가 올 수 없습니다"),
    NOT_NUMBER("[ERROR] 숫자가 입력되어야 합니다");

    private final String message;

    Description(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
