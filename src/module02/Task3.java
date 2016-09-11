package module02;

import static module02.Task2.getCommission;
import static module02.Task4.getOwnerIndex;

public class Task3 {

    private static final double commission = 0.05;

    static int[] balances = {1200, 250, 2000, 500, 3200};
    static String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

    static double withdrawBalance(String ownerName, double withdrawal) {


        int ownerID = getOwnerIndex(ownerName);
        if (ownerID < 0) {
            return -1;
        }

        double balance = balances[ownerID];
        return balance - withdrawal - getCommission(withdrawal);
    }

    public static void main(String[] args) {
        String ownerName = "Ann";       //існує в масиві, має достатньо коштів
        double withdrawal = 100;
        double balanceAfterWithdrawal = withdrawBalance(ownerName, withdrawal);

        System.out.print(ownerName + " ");
        if (balanceAfterWithdrawal < 0) {
            System.out.println("NO");
        } else {
            System.out.println((int) withdrawal + " " + (int) balanceAfterWithdrawal);
        }

        ownerName = "Oww";      //існує в масиві, має недостатньо коштів
        withdrawal = 490;
        balanceAfterWithdrawal = withdrawBalance(ownerName, withdrawal);

        System.out.print(ownerName + " ");
        if (balanceAfterWithdrawal < 0) {
            System.out.println("NO");
        } else {
            System.out.println((int) withdrawal + " " + (int) balanceAfterWithdrawal);
        }

        ownerName = "Owl"; //не існує (!) в масиві
        withdrawal = 490;
        balanceAfterWithdrawal = withdrawBalance(ownerName, withdrawal);

        System.out.print(ownerName + " ");
        if (balanceAfterWithdrawal < 0) {
            System.out.println("NO");
        } else {
            System.out.println((int) withdrawal + " " + (int) balanceAfterWithdrawal);
        }
    }
}
