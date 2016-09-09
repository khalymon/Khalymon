package module02;

public class Task2 {

    /*
    Обычно модификатор доступа у финальной статической переменной private
     */
    private static final double commission = 0.05;

    /*
    Хорошо, правда есть куда улучшить
    если ты напишешь в этом методе
    return balance - withdrawal - withdrawal * commission;
    и вынесешь в отдельный метод withdrawal * commission
    будет лучше.
     */
    static double withdrawBalance(double balance, double withdrawal) {
//        return balance - (commission + 1) * withdrawal;
//        return balance - withdrawal - withdrawal * commission;
        return balance - withdrawal - getCommission(withdrawal);
    }

    private static double getCommission(double withdrawal) {
        return withdrawal * commission;
    }

    public static void main(String[] args) {
        int balance = 100;
        int withdrawal = 10;
        double balanceAfterWithdrawal = withdrawBalance(balance, withdrawal);
        if (balanceAfterWithdrawal < 0) {
            System.out.println("NO");
        } else {
//            System.out.println("OK " + commission * withdrawal + " " + balanceAfterWithdrawal);
            System.out.println("OK " + getCommission(withdrawal) + " " + balanceAfterWithdrawal);
        }

        balance = 100;
        withdrawal = 99;
        balanceAfterWithdrawal = withdrawBalance(balance, withdrawal);
        if (balanceAfterWithdrawal < 0) {
            System.out.println("NO");
        } else {
//            System.out.println("OK " + commission * withdrawal + " " + balanceAfterWithdrawal);
            System.out.println("OK " + getCommission(withdrawal) + " " + balanceAfterWithdrawal);
        }
    }
}
