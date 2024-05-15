package org.example.homework_03_05.passenger;

import java.util.PriorityQueue;
import java.util.Comparator;
public class AirportQueue {
    public static void main(String[] args) {
        PriorityQueue<Passenger> queue = new PriorityQueue<>(10, new Comparator<Passenger>() {

            @Override
            public int compare(Passenger p1, Passenger p2) {
                return Boolean.compare(p2.isFirstClass(), p1.isFirstClass());
            }
        });

        // Добавляем пассажиров, 3 из них первого класса
        queue.add(new Passenger("Passenger 1", false));
        queue.add(new Passenger("Passenger 2", false));
        queue.add(new Passenger("Passenger 3", false));
        queue.add(new Passenger("Passenger 4", false));
        queue.add(new Passenger("Passenger 5", false));
        queue.add(new Passenger("Passenger 6", false));
        queue.add(new Passenger("Passenger 7", true));
        queue.add(new Passenger("Passenger 8", true));
        queue.add(new Passenger("Passenger 9", true));
        queue.add(new Passenger("Passenger 10", false));

        // Обрабатываем очередь до тех пор, пока она не опустеет
        while (!queue.isEmpty()) {
            Passenger p = queue.poll();
            System.out.println("Boarding passenger: " + p);
        }
    }
}
