package taskOOP;

import java.time.LocalDate;
import java.util.Objects;

public class VipClient extends Client{
    final boolean statisfied;
    public VipClient(String name, String surname, int age, String address, boolean isActive, LocalDate birthDate, PaidCard paidCard, boolean statisfied) {
        super(name, surname, age, address, isActive, birthDate, paidCard);
        this.statisfied = statisfied;
    }

    public boolean isStatisfied() {
        return statisfied;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VipClient vipClient = (VipClient) o;
        return statisfied == vipClient.statisfied;
    }

    @Override
    public int hashCode() {
        return Objects.hash(statisfied);
    }
}
