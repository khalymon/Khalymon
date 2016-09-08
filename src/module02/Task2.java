package module02;

public class Task2 {
    public static final double commission = 0.05;

    static double withdrawBalance(double balance, double withdrawal) {
        return balance - (commission + 1) * withdrawal;
    }

    public static void main(String[] args) {
        int balance = 100;
        int withdrawal = 10;
        double balanceAfterWithdrawal = withdrawBalance(balance, withdrawal);
        if (balanceAfterWithdrawal < 0) {
            System.out.println("NO");
        } else {
            System.out.println("OK " + commission * withdrawal + " " + balanceAfterWithdrawal);
        }

        balance = 100;
        withdrawal = 99;
        balanceAfterWithdrawal = withdrawBalance(balance, withdrawal);
        if (balanceAfterWithdrawal < 0) {
            System.out.println("NO");
        } else {
            System.out.println("OK " + commission * withdrawal + " " + balanceAfterWithdrawal);
        }
    }
}
