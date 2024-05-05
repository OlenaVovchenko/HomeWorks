package org.example;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MainBunny {
    public static void main(String[] args) throws SQLException {
        Bunny bunny= new Bunny("Devid");
        System.out.println(bunny.jumping(11));
        bunny.sleep(1);

        try{
            bunny.jumping(0);
            System.out.println("my code is ok before catch exeption");
        }catch (IllegalArgumentException ex){
            System.out.println("My cod is ok after catch exeption");
        }

        try{
            bunny.sleep(25);
            System.out.println("my code is ok before catch exeption");
        }catch (IllegalArgumentException ex){
            System.out.println("My cod is ok after catch exeption");
        }
    }

}
