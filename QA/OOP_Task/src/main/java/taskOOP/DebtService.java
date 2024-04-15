package taskOOP;

import java.time.LocalDate;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class DebtService {

    public boolean isDebtorByCard(PaidCard card) {
        LocalDate deadline = card.getClientType() == ClientType.VIP ? LocalDate.now().minusDays(90) : LocalDate.now().minusDays(30);
        List<LocalDate> sortedDates = card.getPaidMoney().keySet().stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());

        if (!sortedDates.isEmpty()) {
            return sortedDates.get(0).isBefore(deadline);
        }
        return true;
    }

    public boolean cancelDebts(Client client) {
        if (!client.isActive()) {
            return false;
        }

        PaidCard card = client.getPaidCard();
        HashMap<LocalDate, Integer> payments = card.getPaidMoney();

        List<LocalDate> sortedDates = payments.keySet().stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());

        if (sortedDates.size() < 2) {
            return false;
        }

        LocalDate lastPaymentDate = sortedDates.get(0);
        LocalDate secondLastPaymentDate = sortedDates.get(1);

        int lastPayment = payments.get(lastPaymentDate);
        int secondLastPayment = payments.get(secondLastPaymentDate);

        if (lastPayment >= 2 * secondLastPayment) {
            payments.put(lastPaymentDate, 0);
            return true;
        }

        return false;
    }
}