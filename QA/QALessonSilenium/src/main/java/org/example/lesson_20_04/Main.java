package org.example.lesson_20_04;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Anna", "Werder",35,6);
        employee.calculateSalaryVoid();
//        System.out.println(employee.calculateSalary());

//        try {
//            employee.calculateSalary();
//            System.out.println("my code is ok before catch exception");
//        } catch (IllegalArgumentException ex) {
//            System.out.println("My cod is ok after catch exception");
//        }
        try {
            employee.calculateSalaryVoid();
            System.out.println("my code is ok before catch exception");
        } catch (IllegalArgumentException ex) {
            System.out.println("My cod is ok after catch exception");
        }
    }
}
