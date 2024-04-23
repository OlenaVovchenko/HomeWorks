package org.example.lesson_20_04;

public class Employee {

    private final String name;
    private final String surname;
    private final int age;
    private final int workingYears;

    public Employee(String name, String surname, int age, int workingYears) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.workingYears = workingYears;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public int getWorkingYears() {
        return workingYears;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", workingYears=" + workingYears +
                '}';
    }

    public Salary calculateSalary() {
        if (workingYears < 0) {
            throw new IllegalArgumentException("Неправильный диапазон");
        }
        if (workingYears == 0) {
            throw new IllegalArgumentException("Человек не работал");
        }
        if (workingYears > 1 && workingYears < 5) {
            return new Salary(4000, "$");
        }
        return new Salary(10000, "$");
    }
    public void calculateSalaryVoid() {
        if (workingYears < 0) {
            throw new IllegalArgumentException("Неправильный диапазон");
        } else if (workingYears == 0) {
            throw new IllegalArgumentException("Человек не работал");
        } else if (workingYears > 1 && workingYears < 5) {
            System.out.println(new Salary(4000, "$"));
        } else {
            System.out.println(new Salary(10000, "$"));
        }
    }


    //constructor +
    //final to the fields +
    //get set +
    //to String +

    //public Salary calculateSalary(); 1
    //IllegalArgumentException

    //public void calculateSalary(); (2)
    //IllegalArgumentException

}