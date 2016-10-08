package module04.task5;

import module04.task1.Bank;
import module04.task4.User;

public class BankSystemImpl implements BankSystem {

    private double getSummWithCommission(Bank bank, int amount) {
        return amount + getCommission(bank, amount);
    }

    private double getSummWithoutCommission(Bank bank, int amount) {
        return amount - getCommission(bank, amount);
    }

    private double getCommission(Bank bank, int amount) {
        return amount * 0.01 * bank.getCommission(amount);
    }

    public boolean withdrawOfUser(User user, int amount) {
        Bank bank = user.getBank();
        double summWithCommission = getSummWithCommission(bank, amount);
        double balanceAfterWithdrawal = user.getBalance() + summWithCommission;
        if (balanceAfterWithdrawal < 0) {
            System.out.println("Transaction failed. Insufficient funds.");
            return false;
        }
        if (bank.getLimitOfWithdrawal() < balanceAfterWithdrawal) {
            System.out.println("Transaction failed. Sum out of limits.");
            return false;
        }
        user.setBalance(balanceAfterWithdrawal);
        return true;
    }

    public boolean fundUser(User user, int amount) {
        Bank bank = user.getBank();
        double summWithoutCommission = getSummWithoutCommission(bank, amount);
        double balanceAfterFunding = user.getBalance() + summWithoutCommission;
        if (bank.getLimitOfFunding() < summWithoutCommission) {
            System.out.println("Transaction failed. Sum out of limits.");
            return false;
        }
        user.setBalance(balanceAfterFunding);
        return true;
    }

    public boolean transferMoney(User fromUser, User toUser, int amount) {
        boolean withdrawalResult = withdrawOfUser(fromUser, amount);
        boolean fundingResult = fundUser(toUser, amount);
        if (!withdrawalResult || !fundingResult) {
            System.out.println("Transaction failed.");
            return false;
        }
        return true;
    }

    public boolean paySalary(User user) {
        return fundUser(user, user.getSalary());
    }

}
