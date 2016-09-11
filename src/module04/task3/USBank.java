package module04.task3;

import module04.task1.Bank;
import module04.task2.Currency;

public class USBank extends Bank {

    public USBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    public int getLimitOfWithdrawal() {
        if (getCurrency() == Currency.USD) {
            return 1000;
        } else if (getCurrency() == Currency.EUR) {
            return 1200;
        }
        return -1; //unidentified currency
    }

    public int getLimitOfFunding() {
        if (getCurrency() == Currency.EUR) {
            return 10000;
        } else if (getCurrency() == Currency.USD) {
            return Integer.MAX_VALUE;
        }
        return -1; //unidentified currency
    }

    public int getMonthlyRate() {
        if (getCurrency() == Currency.USD) {
            return 1;
        } else if (getCurrency() == Currency.EUR) {
            return 2;
        }
        return -1; //unidentified currency
    }

    public int getCommission(int summ) {
        if (getCurrency() == Currency.USD && summ <= 1000) {
            return 5;
        } else if (getCurrency() == Currency.USD && summ > 1000) {
            return 7;
        } else if (getCurrency() == Currency.EUR && summ <= 1000) {
            return 8;
        } else if (getCurrency() == Currency.EUR && summ > 1000) {
            return 6;
        }
        return -1; //unidentified currency
    }

    @Override
    public String toString() {
        return "usBank";
    }
}
