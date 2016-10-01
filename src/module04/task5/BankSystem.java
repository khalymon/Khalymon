package module04.task5;

import module04.task4.User;

public interface BankSystem {

    boolean withdrawOfUser(User user, int amount);

    boolean fundUser(User user, int amount);

    boolean transferMoney(User fromUser, User toUser, int amount);

    boolean paySalary(User user);

}