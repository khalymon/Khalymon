package module04.task6;

import module04.task2.Currency;
import module04.task4.User;
import module04.task1.Bank;
import module04.task3.USBank;
import module04.task3.EUBank;
import module04.task3.ChinaBank;


public class Main {
    public static void main(String[] args) {

        User[] users = new User[6];


        {
            USBank usBank       =    new USBank(100001, "USA", Currency.USD, 20000, 1000, 1, (10_000_000_000_000L));
            EUBank euBank       =    new EUBank(100002, "EUR", Currency.EUR,  5000,  800, 2,  (2_000_000_000_000L));
            ChinaBank chinaBank = new ChinaBank(100055, "CNY", Currency.USD, 40000,  100, 3, (50_000_000_000_000L));

            users[0].setBank(usBank);
            users[1].setBank(usBank);
            users[2].setBank(euBank);
            users[3].setBank(euBank);
            users[4].setBank(chinaBank);
            users[5].setBank(chinaBank);
        }


    }





}
