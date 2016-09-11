package module04.task6;

import module04.task2.Currency;
import module04.task4.User;
import module04.task3.USBank;
import module04.task3.EUBank;
import module04.task3.ChinaBank;
import module04.task5.BankSystemImpl;

public class Main {

    public static final double EUR_TO_USD = 1.1232;

    public static void main(String[] args) {

        User[] users = new User[6];

        USBank usBank = new USBank(100001, "USA", Currency.USD, 20000, 1000, 1, (10_000_000_000_000L));
        EUBank euBank = new EUBank(100002, "EUR", Currency.EUR, 5000, 800, 2, (2_000_000_000_000L));
        ChinaBank chinaBank = new ChinaBank(100055, "CNY", Currency.USD, 40000, 100, 3, (50_000_000_000_000L));
        BankSystemImpl bankSystemImpl = new BankSystemImpl();

        users[0] = new User(1000, 100, usBank);
        users[1] = new User(500, 50, usBank);
        users[2] = new User(500, 50, euBank);
        users[3] = new User(500, 50, euBank);
        users[4] = new User(2000, 200, chinaBank);
        users[5] = new User(3000, 300, chinaBank);

        System.out.println("users[6] before transactions:");
        for (int i = 0; i < users.length; i++) {
            System.out.println("users[" + i + "] = " + users[i].toString());

        }

        for (int i = 0; i < users.length; i++) {
            bankSystemImpl.paySalary(users[i]);
            bankSystemImpl.fundUser(users[i], 1000);
            bankSystemImpl.withdrawOfUser(users[i], 100);
            bankSystemImpl.transferMoney(users[i], users[(i + 1) % 6], 500);
        }

//            bankSystemImpl.transferMoney(users[1], users[2], 50000); // Transaction failed. Insufficient funds.

        System.out.println("============================");
        System.out.println("users[6] after transactions:");
        for (int i = 0; i < users.length; i++) {
            System.out.println("users[" + i + "] = " + users[i].toString());

        }

    }


}
