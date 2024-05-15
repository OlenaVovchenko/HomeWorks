package org.example.homework_03_05.pasians;

public class Card {

    private Rank rank;

    private Suit suit;

    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }
    @Override
    public String toString() {
        return rank + " of " + suit;
    }
}