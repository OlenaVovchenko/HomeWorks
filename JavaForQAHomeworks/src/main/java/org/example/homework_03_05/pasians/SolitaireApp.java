package org.example.homework_03_05.pasians;

import java.util.Stack;


public class SolitaireApp {
    public static void main(String[] args) {
        Deck deck = new Deck();
        Stack<Card> stack = new Stack<>();
        while (!deck.isEmpty()) {
            Card card = deck.drawCard();
            if (!stack.isEmpty() && stack.peek().equals(card)) { // Note: Card equality check must be properly defined
                stack.pop();
            } else {
                stack.push(card);
            }
        }
        if (stack.isEmpty()) {
            System.out.println("All cards successfully paired and removed.");
        } else {
            System.out.println("Some cards remain unpaired.");
        }
    }
}

