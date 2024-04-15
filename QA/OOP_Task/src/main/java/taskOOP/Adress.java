package taskOOP;

import java.util.Objects;

public class Adress {
    City city;
    int houseNummer;

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public int getHouseNummer() {
        return houseNummer;
    }

    public void setHouseNummer(int houseNummer) {
        this.houseNummer = houseNummer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Adress adress = (Adress) o;
        return houseNummer == adress.houseNummer && city == adress.city;
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, houseNummer);
    }
}
