package module04.task5;

import module04.task2.Currency;
import module04.task4.User;

import static module04.task6.Main.EUR_TO_USD;

public class BankSystemImpl implements BankSystem {

    public boolean withdrawOfUser(User user, int amount) {

        /*
        *   withdrawOfUser() має повертати boolean, т.як: якщо транзакція списання коштів провалилась,
        *   про це потрібно якось інформувати інші методи, які використовують withdrawOfUser();
        *   так, напр., некоректно буде робити fundUser() у методі transferMoney()
        *   після провальної транзакції зняття коштів
        *
        * */

        if (user.getBank().getLimitOfWithdrawal() < 0 || user.getBank().getCommission(amount) < 0) {
            System.out.println("Transaction failed. Can't identify currency.");
            return false;
        } else {
            double balanceProjected = user.getBalance() - amount * (1 + 0.01 * user.getBank().getCommission(amount));
            if (balanceProjected < 0) {
                System.out.println("Transaction failed. Insufficient funds.");
                return false;
            } else {
                user.setBalance(balanceProjected);
                return true;
            }
        }
    }

    public void fundUser(User user, int amount) {
        if (user.getBank().getLimitOfFunding() < 0 || user.getBank().getCommission(amount) < 0) {
            System.out.println("Transaction failed. Can't identify currency.");
        } else {
            double balanceProjected = user.getBalance() + amount * (1 - 0.01 * user.getBank().getCommission(amount));
            /*
            *   тут можна обійтись без допоміжної змінної balanceProjected
            *   я її ввів суто для полегшення сприйняття коду цього методу
            *
            * */
            user.setBalance(balanceProjected);
        }
    }

    public void transferMoney(User fromUser, User toUser, int amount) {
//        if (withdrawOfUser(fromUser, amount)) {     // цей код не враховує,
//            fundUser(toUser, amount);               // що в User-ів може бути
//        }                                           // різна валюта

        if (withdrawOfUser(fromUser, amount)) {
            if (fromUser.getBank().getCurrency().equals(toUser.getBank().getCurrency())) {
                fundUser(toUser, amount);             // якщо валюти співпадають, то переказ відбувається просто;
            } else {                                  // якщо валюти різні, враховуємо це окремо:
                if (fromUser.getBank().getCurrency().equals(Currency.EUR)) {
                    fundUser(toUser, (int) (amount * EUR_TO_USD));
                } else {
                    fundUser(toUser, (int) (amount / EUR_TO_USD));
                }
            }
        }

    }

    public void paySalary(User user) {
        fundUser(user, user.getSalary());
    }

}
