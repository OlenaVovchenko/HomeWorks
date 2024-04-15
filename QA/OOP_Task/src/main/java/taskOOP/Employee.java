package taskOOP;

import java.time.LocalDate;
import java.util.Objects;

public class Employee implements HumanResources{
final String name;
final String surname;
Adress homeAddress;
LocalDate birthday;

    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Adress getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(Adress homeAddress) {
        this.homeAddress = homeAddress;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name) && Objects.equals(surname, employee.surname) && Objects.equals(homeAddress, employee.homeAddress) && Objects.equals(birthday, employee.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, homeAddress, birthday);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", homeAddress=" + homeAddress +
                ", birthday=" + birthday +
                '}';
    }

    @Override
    public boolean needMedicalsurance() {
        return false;
    }
}
