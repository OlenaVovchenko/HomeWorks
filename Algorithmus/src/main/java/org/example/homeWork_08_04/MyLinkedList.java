package org.example.homeWork_08_04;
//1) Создать MyLinkedList объект.
//Создать искусственно петлю в связном списке.
//Написать метод detectLoop, который проверяет, есть ли петля в MyLinkedList.

public class MyLinkedList {
    public Node head;

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
    }

    public void createLoop(Node loopNode) {
        Node current = head;
        while (current != null && current.getNext() != null) {
            current = current.getNext();
        }
        if (current != null){
            current.setNext(loopNode);
            loopNode.setNext(head);
        }
    }
    public boolean detectLoop() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.getNext() != null) {
            slow = slow.getNext();
            fast = fast.getNext().getNext();

           if (slow == fast) {
                return true;
            }
        }
        return false;
    }

}
