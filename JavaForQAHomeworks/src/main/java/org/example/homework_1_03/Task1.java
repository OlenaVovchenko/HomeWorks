package org.example.homework_1_03;

import java.util.ArrayList;
import java.util.List;

// у вас есть список значений int и вы должны вернуть список, каждое
// значение которого умножается на 2
public class Task1 {
    public static void main(String[] args) {
        int [] numbers = {2, 5, 7, 3, 6};
        List<Integer> numMultiplied= new ArrayList<>();
        generateNumMultiplied(numbers, numMultiplied);
        System.out.println(numMultiplied);
    }

    public static void generateNumMultiplied (int[] numbers, List<Integer> list) {
        for (int i = 0; i < numbers.length; i++) {
            list.add(numbers[i]*2);
        }
    }
}
