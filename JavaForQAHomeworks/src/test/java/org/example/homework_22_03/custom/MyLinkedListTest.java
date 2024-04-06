package org.example.homework_22_03.custom;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyLinkedListTest {
    @Test
    public void removeFirstTest() {
        MyLinkedList list = new MyLinkedList();
        list.addFirst(1); // Используйте addFirst, так как addLast не реализован
        list.addFirst(2);
        list.removeFirst();
        String listAsString = list.toString();
        assertEquals("1 ", listAsString);
    }

    @Test
    public void removeLastTest() {
        MyLinkedList list = new MyLinkedList();
        list.addFirst(2); // Используйте addFirst, так как addLast не реализован
        list.addFirst(1);
        list.removeLast();
        String listAsString = list.toString();
        assertEquals("1 ", listAsString);
    }
}