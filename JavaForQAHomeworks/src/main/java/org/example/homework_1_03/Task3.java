package org.example.homework_1_03;

import java.util.ArrayList;
import java.util.List;

// у вас есть список значений int и вы должны вернуть список,
// содержащий только нечетные числа
public class Task3 {
    public static void main(String[] args) {
        List<Integer> values = List.of(3,5,6,7,8,9,3,4,5,7);
        ArrayList<Integer> valuesOdd = new ArrayList<>();

        for (int i : values){
            if (i %2 != 0){
                valuesOdd.add(i);
            }
        }
        System.out.println(valuesOdd);
    }
}
