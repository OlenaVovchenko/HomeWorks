package org.example.homeWork_25_03;
//Реализовать структуру данных SpecialStack, которая поддерживает все операции со стеком,
//такие как push(), pop(), isEmpty(), … и дополнительную операцию getMin(),
//которая должна возвращать минимальный элемент из SpecialStack.
//Все эти операции SpecialStack должны быть O(1). Пространство O(n)
//Чтобы реализовать SpecialStack, используйте структуру данных Stack, реализованную ранее в классе.
public class SpecialStack {

    private final int[] arr;
    private final int[] minArr;
    private int top;
    private final int capacity;

    public SpecialStack(int size) {
        arr = new int[size];
        minArr = new int[size];
        capacity = size;
        top = -1;
    }

    // push elements to the top of stack
    public void push(int x) {
        if (isFull()) {
            System.out.println("Stack OverFlow");
        } else {
            // insert element on top of stack
            System.out.println("Inserting " + x);
            arr[++top] = x;
        }
    }

    // pop elements from top of stack
    public int pop() {
        // if stack is empty no element to pop
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        // pop element from top of stack
        return arr[top--];
    }

    // return size of the stack
    public int getSize() {
        return top + 1;
    }

    // check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // check if the stack is full
    public boolean isFull() {
        return top == capacity - 1;
    }

    public int peek() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return -1;
        } else {
            return arr[top];
        }
    }

    // display elements of stack
    public void printStack() {
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public void pushMin(int x) {
        if (isFull()) {
            System.out.println("Stack OverFlow");
            return;
        }
        System.out.println("Inserting " + x);
        arr[++top] = x;
        if (top == 0 || x <= minArr[top - 1]) {
            minArr[top] = x;
        } else {
            minArr[top] = minArr[top - 1];
        }
    }

    public int popMin() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        int poppedElement = arr[top];
        top--;
        return poppedElement;
    }

        public int getMin() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return Integer.MAX_VALUE;
        }
        return minArr[top];
    }

}