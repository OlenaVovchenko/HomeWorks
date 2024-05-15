package org.example.homework_03_05.passenger;

import java.util.PriorityQueue;
import java.util.Comparator;

class Passenger {
    private String name;
    private boolean isFirstClass;

    public Passenger(String name, boolean isFirstClass) {
        this.name = name;
        this.isFirstClass = isFirstClass;
    }

    public String getName() {
        return name;
    }

    public boolean isFirstClass() {
        return isFirstClass;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "name='" + name + '\'' +
                ", isFirstClass=" + isFirstClass +
                '}';
    }
}