package module04.task3;

import module04.task1.Bank;
import module04.task2.Currency;

public class ChinaBank extends Bank {

    public ChinaBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    public int getLimitOfWithdrawal() {
        if (getCurrency() == Currency.USD) {
            return 100;
        } else if (getCurrency() == Currency.EUR) {
            return 150;
        }
        return -1; //unidentified currency
    }

    public int getLimitOfFunding() {
        if (getCurrency() == Currency.EUR) {
            return 5000;
        } else if (getCurrency() == Currency.USD) {
            return 10000;
        }
        return -1; //unidentified currency
    }

    public int getMonthlyRate() {
        if (getCurrency() == Currency.USD) {
            return 1;
        } else if (getCurrency() == Currency.EUR) {
            return 0;
        }
        return -1; //unidentified currency
    }

    public int getCommission(int summ) {

        if (getCurrency() == Currency.USD && summ <= 1000) {
            return 3;
        } else if (getCurrency() == Currency.USD && summ > 1000) {
            return 5;
        } else if (getCurrency() == Currency.EUR && summ <= 1000) {
            return 10;
        } else if (getCurrency() == Currency.EUR && summ > 1000) {
            return 11;
        }
        return -1; //unidentified currency
    }

    @Override
    public String toString() {
        return "chinaBank";
    }
}
