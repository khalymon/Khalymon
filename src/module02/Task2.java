package module02;

public class Task2 {
    static double withdrawBalance(double balance, double withdrawal) {
        double commission = 0.05;
        double balanceAfterWithdrawal = balance - (commission+1)*withdrawal;
        if(balanceAfterWithdrawal < 0) {
            System.out.println("NO");
            balanceAfterWithdrawal = -1;
        }
        else System.out.println("OK " + commission*withdrawal + " " + balanceAfterWithdrawal);
        return balanceAfterWithdrawal;
    }

    public static void main(String[] args) {
        int balance = 100;
        int withdrawal = 10;
        withdrawBalance(balance, withdrawal);

        balance = 100;
        withdrawal = 99;
        withdrawBalance(balance, withdrawal);
    }
}
