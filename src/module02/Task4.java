package module02;

public class Task4 {
    static double fundBalance(String ownerName, double fund) {
        int[] balances = {1200, 250, 2000, 500, 3200};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
        int ownerID = -1;
        for(int i = 0; i < ownerNames.length; i++){
            if(ownerNames[i].equals(ownerName)){
                ownerID = i;
                break;
            }
        }
        double balance = balances[ownerID];
        double balanceAfterFunding = balance + fund;
        System.out.println(ownerName + " " + balanceAfterFunding);
        return balanceAfterFunding;
    }
    public static void main(String[] args) {
        String ownerName = "Oww";
        double fund = 100;
        fundBalance(ownerName, fund);
    }
}
