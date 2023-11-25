package baseball;

import controller.BaseballManager;

public class Application {
    public static void main(String[] args) {
        BaseballManager baseballManager = new BaseballManager();
        baseballManager.gameStart();
    }
}
