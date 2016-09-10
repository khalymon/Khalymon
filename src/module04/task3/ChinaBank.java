package module04.task3;

import module04.task1.Bank;
import module04.task2.Currency;

public class ChinaBank extends Bank{

    public ChinaBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    public int getLimitOfWithdrawal() {
        if (getCurrency() == Currency.USD) {
            return 100;
        } else {
            return 150;
        }
    }

    public int getLimitOfFunding() {
        if (getCurrency() == Currency.EUR) {
            return 5000;
        } else {
            return 10000;
        }
    }

    public int getMonthlyRate() {
        if (getCurrency() == Currency.USD) {
            return 1;
        } else {
            return 0;
        }
    }

    public int getCommission(int summ) {

        if (getCurrency() == Currency.USD) {
            if (summ <= 1000) {
                return 3;
            } else {
                return 5;
            }
        } else {
            if (summ <= 1000) {
                return 10;
            } else {
                return 11;
            }
        }

    }
}
