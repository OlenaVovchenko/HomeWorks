package taskOOP;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Objects;

public class PaidCard {
    private HashMap<LocalDate, Integer> paidMoney= new HashMap<>();
    private ClientType clientType;

    public PaidCard(HashMap<LocalDate, Integer> paidMoney, ClientType clientType) {
        this.paidMoney = paidMoney;
        this.clientType = clientType;
    }

    public HashMap<LocalDate, Integer> getPaidMoney() {
        return paidMoney;
    }

    public void setPaidMoney(HashMap<LocalDate, Integer> paidMoney) {
        this.paidMoney = paidMoney;
    }

    public ClientType getClientType() {
        return clientType;
    }

    public void setClientType(ClientType clientType) {
        this.clientType = clientType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PaidCard paidCard = (PaidCard) o;
        return Objects.equals(paidMoney, paidCard.paidMoney) && clientType == paidCard.clientType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(paidMoney, clientType);
    }
    public void payMoney(int sum) {
        int minimumSum = clientType == ClientType.VIP ? 1000 : 500;
        if (sum >= minimumSum) {paidMoney.put(LocalDate.now(), sum);
        } else {
            System.out.println("The paid sum does not meet the minimum requirements for a " + clientType + " client.");
        }
    }
}
