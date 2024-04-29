package org.example.homeWork_22_04;

public class Elevator {
    private final String name;
    private int currentFloor;

    public Elevator(String name, int currentFloor) {
        this.name = name;
        this.currentFloor = currentFloor;
    }

    public String getName() {
        return name;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void moveToFloor(int destinationFloor) {
     this.currentFloor = destinationFloor;
    }
}
