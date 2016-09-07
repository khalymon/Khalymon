package module02;

public class Task3 {
    static double withdrawBalance(String ownerName, double withdrawal) {
        int[] balances = {1200, 250, 2000, 500, 3200};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
        double commission = 0.05;
        int ownerID = -1;
        for(int i = 0; i < ownerNames.length; i++){
            if(ownerNames[i].equals(ownerName)){
                ownerID = i;
                break;
            }
        }
        double balance = balances[ownerID];
        double balanceAfterWithdrawal = balance - (commission+1)*withdrawal;
        System.out.print(ownerName + " ");
        if(balanceAfterWithdrawal < 0) {
            System.out.println("NO");
            balanceAfterWithdrawal = -1;
        }
        else System.out.println(withdrawal + " " + balanceAfterWithdrawal);
        return balanceAfterWithdrawal;
    }
    public static void main(String[] args) {
        String ownerName = "Ann";
        double withdrawal = 100;
        withdrawBalance(ownerName, withdrawal);

        ownerName = "Oww";
        withdrawal = 490;
        withdrawBalance(ownerName, withdrawal);
    }
}
