package org.example;

import java.sql.SQLException;

public class Bunny {   private String name;


    public Bunny(String name) {
        this.name = name;

    }


    public int jumping(int age) throws SQLException {
        if (age <= 0){
            throw new SQLException();
        }

        if (age > 10){
            return 2;
        } else {
            return 5;
        }

    }
    public void sleep (int time){
        if (time > 24 || time<0){
            throw new IllegalArgumentException("Время в суточный интервал");}
         else if (time >= 1 && time <=8) {
            System.out.println("УРА! Зайчик спит.");
        }
         else {
            System.out.println("К сожалению время не для сна");
        }
    }
}
