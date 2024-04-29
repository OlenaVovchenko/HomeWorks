package org.example.homeWork_22_04;

public class Building {
    private final Elevator elevatorA;
    private final Elevator elevatorB;
    private final int totalFloors;

    public Building(int totalFloors) {
        this.totalFloors = totalFloors;
        this.elevatorA = new Elevator("A", 0);
        this.elevatorB = new Elevator("B", 8);
    }

    public void callElevator(int callingFloor) {
        int distanceA = Math.abs(elevatorA.getCurrentFloor() - callingFloor);
        int distanceB = Math.abs(elevatorB.getCurrentFloor() - callingFloor);

        Elevator closestElevator = distanceA <= distanceB ? elevatorA : elevatorB;
        System.out.println("Отправляем лифт " + closestElevator.getName());
        closestElevator.moveToFloor(callingFloor);
    }
}
