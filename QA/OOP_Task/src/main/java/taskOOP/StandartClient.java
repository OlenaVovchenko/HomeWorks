package taskOOP;

import java.time.LocalDate;

public class StandartClient extends Client{
    final boolean wasOnceInactive;
      public StandartClient(String name, String surname, int age, String address, boolean isActive, LocalDate birthDate, PaidCard paidCard, boolean wasOnceInactive) {
        super(name, surname, age, address, isActive, birthDate, paidCard);
        this.wasOnceInactive = wasOnceInactive;
    }
}
