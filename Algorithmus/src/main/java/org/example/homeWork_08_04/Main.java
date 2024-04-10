package org.example.homeWork_08_04;

public class Main {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);


        System.out.println("Цикл обнаружен до создания: " + list.detectLoop()); // Ожидаем false

        list.createLoop(list.head);

        System.out.println("Цикл обнаружен после создания: " + list.detectLoop()); // Ожидаем true
    }
}