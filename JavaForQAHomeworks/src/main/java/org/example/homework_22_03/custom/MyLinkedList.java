package org.example.homework_22_03.custom;

public class MyLinkedList {

    private Node head;

    public void addFirst(int data) {
        Node node = new Node(data, null);
        //Если список пустой, то новый элемент станет его головой и первым элементом
        if(head == null) {
            head = node;
            return;
        }
        //Если список не пустой
        //новый элемент будет ссылаться на старую голову и сам станет головой списка
        node.setNext(head);
        head = node;
    }

    public void addLast(int data) {
        if (head == null) {
            head = new Node(data, null);
            return;
        }
        Node current = head;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(new Node(data, null));
    }

    public void removeFirst() {
               if(head != null) {
            head = head.getNext();
               }
    }

    public void removeLast() {
        if(head == null || head.getNext() == null) {
            head = null;
            return;
        }

        Node current = head;
        while(current.getNext().getNext() != null) {
            current = current.getNext();
        }
        current.setNext(null);
    }
private String print(){
        StringBuilder stringBuilder = new StringBuilder();
    Node current = head;
    while (current != null) {
        stringBuilder.append(current.getData()).append(" ");
        current = current.getNext();
    }
    return  stringBuilder.toString();
}
@Override
    public  String toString(){
        return print();
}
}
