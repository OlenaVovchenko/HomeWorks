package org.example.homework_1_03;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

// у вас есть список значений String , и вы должны вернуть список этих
// значений без каких-либо дубликатов.
public class Task4 {
    public static void main(String[] args) {
        List<String> stringsReprtition = List.of("I", "am", "going", "going", "for", "for", "a", "a", "walk", "walk");
        Set<String> set = new LinkedHashSet<>(stringsReprtition);
        List<String> newStringUnique = new ArrayList<>(set);

        System.out.println(newStringUnique);

    }
}
