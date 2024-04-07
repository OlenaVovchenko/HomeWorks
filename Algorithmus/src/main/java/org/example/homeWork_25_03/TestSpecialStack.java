package org.example.homeWork_25_03;

public class TestSpecialStack {
    public static void main(String[] args) {
        SpecialStack stack = new SpecialStack(8);
        stack.pushMin(1);
        stack.pushMin(2);
        stack.pushMin(3);
        stack.pushMin(4);

        System.out.println();
        System.out.print("Stack min: ");
        stack.printStack();
        System.out.print(" <-- top");
        System.out.println();

        // remove element from stack
        stack.popMin();
        System.out.println(" pop min");
        stack.printStack();
        System.out.println("Current minimum: " + stack.getMin());
    }
}
