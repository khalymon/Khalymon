package module04.task3;

import module04.task1.Bank;
import module04.task2.Currency;

public class EUBank extends Bank{

    public EUBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    public int getLimitOfWithdrawal(){
        return -1;
    }
    public  int getLimitOfFunding(){
        return -1;
    };

    public  int getMonthlyRate(){
        return -1;
    };

    public  int getCommission(int summ){
        return -1;
    };
}
