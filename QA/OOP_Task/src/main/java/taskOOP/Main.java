package taskOOP;
//Создать вип клиент
//Создать 2 стандартных
//Посчитать сумму подарка для стандартног клиента
//Посчитать сумму подарка для  вип клиента
//Вип клиент оплатил 01 января  2024 1000
//Стандартный  клиент оплатил 15 декабря  2022 500
//Стандартный  клиент оплатил 19 декабря  2022 500
//Должник ли вип клиент?
//Должник ли стандартный клиент?
//Может ли списать долги аип клиенту?
//Может ли списать долги стандартному клиенту?
//Создать сотрудника
//Нужна ли страховка сотруднику?
//Нужна ли страховка вип клиенту?
//Нужна ли страховка стандартному клиенту?




import java.time.LocalDate;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Создание VIP клиента
        PaidCard vipPaidCard = new PaidCard(new HashMap<>(), ClientType.VIP);
        VipClient vipClient = new VipClient("ИмяVIP", "ФамилияVIP", 30, "Berlin", true, LocalDate.of(1990, 1, 1), vipPaidCard, true);
        vipPaidCard.payMoney(1000); // VIP клиент оплатил 1000

        // Создание стандартных клиентов
        PaidCard standardPaidCard1 = new PaidCard(new HashMap<>(), ClientType.STANDARD);
        Client standardClient1 = new StandartClient("ИмяStandard1", "ФамилияStandard1", 30, "Berlin", true, LocalDate.of(1990, 1, 1), standardPaidCard1, false);
        standardPaidCard1.payMoney(500); // Стандартный клиент оплатил 500

        PaidCard standardPaidCard2 = new PaidCard(new HashMap<>(), ClientType.STANDARD);
        Client standardClient2 = new StandartClient("ИмяStandard2", "ФамилияStandard2", 30, "Berlin", true, LocalDate.of(1990, 1, 1), standardPaidCard2, false);
        standardPaidCard2.payMoney(500); // Стандартный клиент оплатил 500

        // Подсчет суммы подарка (например, сумма подарка может быть равна сумме последней оплаты)
        int giftForStandardClient = standardPaidCard1.getPaidMoney().get(LocalDate.now());
        int giftForVipClient = vipPaidCard.getPaidMoney().get(LocalDate.now());

        // Проверка, должник ли VIP клиент
        DebtService debtService = new DebtService();
        boolean isVipDebtor = debtService.isDebtorByCard(vipPaidCard);

        // Проверка, должник ли стандартный клиент
        boolean isStandardDebtor = debtService.isDebtorByCard(standardPaidCard1);

        // Возможность списания долгов
        boolean canCancelDebtsVip = debtService.cancelDebts(vipClient);
        boolean canCancelDebtsStandard = debtService.cancelDebts(standardClient1);

        // Создание сотрудника и проверка на необходимость страховки
        Employee employee = new Employee("Елена", "Вовченко");
        boolean employeeNeedsInsurance = employee.needMedicalsurance();


        // Проверка на необходимость страховки для клиентов
        boolean vipClientNeedsInsurance = vipClient.needMedicalsurance();
        boolean standardClient1NeedsInsurance = standardClient1.needMedicalsurance();

        // Вывод результатов
        System.out.println("Сумма подарка для стандартного клиента: " + giftForStandardClient);
        System.out.println("Сумма подарка для VIP клиента: " + giftForVipClient);
        System.out.println("VIP клиент должник: " + isVipDebtor);
        System.out.println("Стандартный клиент должник: " + isStandardDebtor);
        System.out.println("Нужна ли страховка сотруднику? " + standardClient1NeedsInsurance);
        System.out.println("Нужна ли страховка VIP клиенту? " + vipClientNeedsInsurance);
        System.out.println("Есть ли возможность списания долгов VIP клиенту? " + canCancelDebtsStandard);
        System.out.println("Есть ли возможность списания долгов для стандартного клиента? " + canCancelDebtsVip);
        System.out.println("Нужна ли страховка сотруднику " + employee.getName() + "? " + employeeNeedsInsurance);

    }
    }
