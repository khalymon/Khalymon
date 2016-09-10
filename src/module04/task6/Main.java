package module04.task6;

import module04.task2.Currency;
import module04.task4.User;
import module04.task3.USBank;
import module04.task3.EUBank;
import module04.task3.ChinaBank;
import module04.task5.BankSystemImpl;


public class Main {
    public static void main(String[] args) {

        User[] users = new User[6];
        for (int i = 0; i < users.length; i++) {
            users[i] = new User();
        }

        {
            USBank usBank = new USBank(100001, "USA", Currency.USD, 20000, 1000, 1, (10_000_000_000_000L));
            EUBank euBank = new EUBank(100002, "EUR", Currency.EUR, 5000, 800, 2, (2_000_000_000_000L));
            ChinaBank chinaBank = new ChinaBank(100055, "CNY", Currency.USD, 40000, 100, 3, (50_000_000_000_000L));
            BankSystemImpl bankSystemImpl = new BankSystemImpl();

            users[0].setBank(usBank);
            users[1].setBank(usBank);
            users[2].setBank(euBank);
            users[3].setBank(euBank);
            users[4].setBank(chinaBank);
            users[5].setBank(chinaBank);

            users[0].setSalary(100);
            users[1].setSalary(50);
            users[2].setSalary(50);
            users[3].setSalary(50);
            users[4].setSalary(200);
            users[5].setSalary(300);

            users[0].setBalance(1000);
            users[1].setBalance(500);
            users[2].setBalance(500);
            users[3].setBalance(500);
            users[4].setBalance(2000);
            users[5].setBalance(3000);

            for (int i = 0; i < users.length; i++) {
                bankSystemImpl.paySalary(users[i]);
                bankSystemImpl.fundUser(users[i], 10);
                bankSystemImpl.withdrawOfUser(users[i], 1);
                bankSystemImpl.transferMoney(users[i], users[(i + 1) % 6], 5);
            }

            for (User i : users) {
                System.out.println(i.toString());

            }
        }
        System.out.println("Hello");

    }


}
