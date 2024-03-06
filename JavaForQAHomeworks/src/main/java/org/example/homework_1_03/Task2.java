package org.example.homework_1_03;

import java.util.ArrayList;
import java.util.List;

//у вас есть список значений String , и вы должны вернуть список длины
// каждого из этих значений String .
public class Task2 {
    public static void main(String[] args) {
        List<String> strings = List.of("Hello", "ich", "mache", "die", "Hausaufgabe!");
        List<Integer> lengths = new ArrayList<>();

        for (String str : strings) {
            lengths.add(str.length());
        }

        System.out.println(lengths);
    }
}
