package module04.task3;

import module04.task1.Bank;
import module04.task2.Currency;

public class EUBank extends Bank {

    public EUBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    public int getLimitOfWithdrawal() {
        if (getCurrency() == Currency.USD) {
            return 2000;
        } else {
            return 2200;
        }
    }

    public int getLimitOfFunding() {
        if (getCurrency() == Currency.EUR) {
            return 20000;
        } else {
            return 10000;
        }
    }

    public int getMonthlyRate() {
        if (getCurrency() == Currency.USD) {
            return 0;
        } else {
            return 1;
        }
    }

    public int getCommission(int summ) {

        if (getCurrency() == Currency.USD) {
            if (summ <= 1000) {
                return 5;
            } else {
                return 7;
            }
        } else {
            if (summ <= 1000) {
                return 2;
            } else {
                return 4;
            }
        }

    }
}
