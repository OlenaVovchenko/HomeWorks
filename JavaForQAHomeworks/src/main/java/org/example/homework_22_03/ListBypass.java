package org.example.homework_22_03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListBypass {
    public static void main(String[] args) {
        // Создать лист, наполнить его 10М (миллионами) элементов.
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i<10000000; i++){
            list.add(i);
        }
        //перебрать for-each loop
        long startTime = System.currentTimeMillis();
        for (int i : list) {
            int temp = i;
        }
        long endTime = System.currentTimeMillis();
        System.out.println("For-each loop duration: " + (endTime - startTime) + " ms");

        //classic for и вызываем внутри цикла list.size() для каждой итерации
        startTime = System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++) {
            int temp = list.get(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Classic for loop with list.size() duration: " + (endTime - startTime) + " ms");

        //classic for, но list.size() определяем в переменную
        int size = list.size();
        startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            int temp = list.get(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Classic for loop with size variable duration: " + (endTime - startTime) + " ms");

        //classic for, list.size() определяем в переменную, перебираем с конца (i--)
        startTime = System.currentTimeMillis();
        for (int i = size - 1; i >= 0; i--) {
            int temp = list.get(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Classic for loop backwards duration: " + (endTime - startTime) + " ms");

        //используя Itertor
        Iterator<Integer> iterator = list.iterator();
        startTime = System.currentTimeMillis();
        while (iterator.hasNext()) {
            int temp = iterator.next();
        }
        endTime = System.currentTimeMillis();
        System.out.println("Iterator duration: " + (endTime - startTime) + " ms");

        //используя ListIterator
        ListIterator<Integer> listIterator = list.listIterator();
        startTime = System.currentTimeMillis();
        while (listIterator.hasNext()) {
            int temp = listIterator.next();
        }
        endTime = System.currentTimeMillis();
        System.out.println("ListIterator duration: " + (endTime - startTime) + " ms");
    }
}
