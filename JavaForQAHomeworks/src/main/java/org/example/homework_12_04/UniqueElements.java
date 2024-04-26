package org.example.homework_12_04;
//Задание 1 :Сгенерировать список из 500 целочисленных элементов
//Достаточно создать объект Random random = new Random();
//И в цикле добавлять случайное значение в список в виде int element = random.nextInt(10);

import java.util.*;

public class UniqueElements {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i<500; i++){
            int element = random.nextInt(10);
            list.add(element);
        }
        Set<Integer> uniqueElements = new HashSet<>(list);

        System.out.println("Набор уникальных элементов");
        System.out.println(uniqueElements);

        Set<Integer> sortedUniqueElements = new TreeSet<>(uniqueElements);
        System.out.println("Отсортированный набор уникальных элементов: ");
        System.out.println(sortedUniqueElements);
    }
}
