package module02;

public class Task3 {
    public static final double commission = 0.05;

    static double withdrawBalance(String ownerName, double withdrawal) {
        int[] balances = {1200, 250, 2000, 500, 3200};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
        int ownerID = -1;
        for (int i = 0; i < ownerNames.length; i++) {
            if (ownerNames[i].equals(ownerName)) {
                ownerID = i;
                break;
            }
        }
        double balance = balances[ownerID];
        return balance - (commission + 1) * withdrawal;
    }

    public static void main(String[] args) {
        String ownerName = "Ann";
        double withdrawal = 100;
        double balanceAfterWithdrawal = withdrawBalance(ownerName, withdrawal);

        System.out.print(ownerName + " ");
        if (balanceAfterWithdrawal < 0) {
            System.out.println("NO");
        } else {
            System.out.println((int) withdrawal + " " + (int) balanceAfterWithdrawal);
        }

        ownerName = "Oww";
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
