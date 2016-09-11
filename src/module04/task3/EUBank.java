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
        } else if (getCurrency() == Currency.EUR) {
            return 2200;
        }
        return -1; //unidentified currency
    }

    public int getLimitOfFunding() {
        if (getCurrency() == Currency.EUR) {
            return 20000;
        } else if (getCurrency() == Currency.USD) {
            return 10000;
        }
        return -1; //unidentified currency
    }

    public int getMonthlyRate() {
        if (getCurrency() == Currency.USD) {
            return 0;
        } else if (getCurrency() == Currency.EUR) {
            return 1;
        }
        return -1; //unidentified currency
    }

    public int getCommission(int summ) {
        if (getCurrency() == Currency.USD && summ <= 1000) {
            return 5;
        } else if (getCurrency() == Currency.USD && summ > 1000) {
            return 7;
        } else if (getCurrency() == Currency.EUR && summ <= 1000) {
            return 2;
        } else if (getCurrency() == Currency.EUR && summ > 1000) {
            return 4;
        }

        return -1; //unidentified currency
    }

    @Override
    public String toString() {
        return "euBank";
    }
}
