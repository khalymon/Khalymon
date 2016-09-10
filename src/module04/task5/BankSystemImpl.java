package module04.task5;

import module04.task4.User;

public class BankSystemImpl implements BankSystem {


    public void withdrawOfUser(User user, int amount) {
        user.setBalance(user.getBalance() - amount);
    }

    public void fundUser(User user, int amount) {
        user.setBalance(user.getBalance() + amount);
    }

    public void transferMoney(User fromUser, User toUser, int amount) {
        if (fromUser.equals(toUser)) {
            return;
        } else {
            withdrawOfUser(fromUser, amount);
            fundUser(toUser, amount);
        }

    }

    public void paySalary(User user) {
        user.setBalance(user.getBalance() + user.getSalary());
    }
}



