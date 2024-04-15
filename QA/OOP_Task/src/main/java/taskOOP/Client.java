package taskOOP;

import java.time.LocalDate;
import java.util.Objects;

public class Client implements HumanResources {
    protected String name;
    final String surname;
    protected int age;
    protected String address;
    protected boolean isActive;
    final LocalDate birthDate;
    PaidCard paidCard;

    public Client(String name, String surname, int age, String address, boolean isActive, LocalDate birthDate, PaidCard paidCard) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
        this.isActive = isActive;
        this.birthDate = birthDate;
        this.paidCard = paidCard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public PaidCard getPaidCard() {
        return paidCard;
    }

    public void setPaidCard(PaidCard paidCard) {
        this.paidCard = paidCard;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return age == client.age && isActive == client.isActive && Objects.equals(name, client.name) && Objects.equals(surname, client.surname) && Objects.equals(address, client.address) && Objects.equals(birthDate, client.birthDate) && Objects.equals(paidCard, client.paidCard);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, address, isActive, birthDate, paidCard);
    }

    @Override
    public boolean needMedicalsurance() {
        return this.isActive && this.age > 55 && "Berlin".equalsIgnoreCase(this.address);
    }

}