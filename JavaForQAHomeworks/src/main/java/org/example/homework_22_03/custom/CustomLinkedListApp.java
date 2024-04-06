package org.example.homework_22_03.custom;

//Попробуйте реализовать подобно методам урока в этом списке методы :
//removeFirst и removeLast
//Добавьте два теста на эти методы, все как делали на уроке.


public class CustomLinkedListApp {

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.addFirst(10);
        list.addFirst(5);
        list.addLast(15);
        list.addLast(7);
        //5 10 15 7
        //System.out.println(list);
        System.out.println("custom linked list in class MyLinkedlist");
        System.out.println(list);


        Node four = new Node(7, null);
        Node three = new Node(15, four);
        Node two = new Node(10, three);
        Node one = new Node(5, two); // head of Linked List

        //TreeNode (data, left, right)

        // print ll without additional class
        Node current = one;
        while (current != null) {
            System.out.print(" " + current.getData());
            current = current.getNext();
        }


    }


}