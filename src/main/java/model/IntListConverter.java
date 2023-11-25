package model;

import java.util.ArrayList;
import java.util.List;

public class IntListConverter {

    public List<Integer> intToList(int inputNumber) {
        List<Integer> numberList = new ArrayList<>();
        while (inputNumber > 0) {
            numberList.add(inputNumber % 10);
            inputNumber /= 10;
        }
        return numberList;
    }
}
