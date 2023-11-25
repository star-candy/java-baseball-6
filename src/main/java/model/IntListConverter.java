package model;

import java.util.ArrayList;
import java.util.List;

public class IntListConverter {

    public List<Integer> intToList(int inputNumber) {
        List<Integer> numberList = new ArrayList<>();

        numberList.add(inputNumber / 100);          // 첫 번째 자리
        numberList.add((inputNumber % 100) / 10);   // 두 번째 자리
        numberList.add(inputNumber % 10);           // 세 번째 자리
        return numberList;
    }
}
