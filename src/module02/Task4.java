package module02;

public class Task4 {

    static int[] balances = {1200, 250, 2000, 500, 3200};
    static String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

    static double fundBalance(String ownerName, double fund) {
        int ownerIndex = getOwnerIndex(ownerName);
        if (ownerIndex < 0) {
            return -1;
        }
        balances[ownerIndex] += fund;
        return balances[ownerIndex];
    }

    public static int getOwnerIndex(String ownerName) {
        for (int i = 0; i < ownerNames.length; i++) {
            if (ownerNames[i].equals(ownerName)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        String ownerName = "Oww";   //існує в масиві
        double fund = 100;
        double balanceAfterFunding = fundBalance(ownerName, fund);
        if(balanceAfterFunding < 0) {
            System.out.println(ownerName + " NO");
        }
        else {
            System.out.println(ownerName + " " + (int) balanceAfterFunding);
        }

        ownerName = "Owl";  //не існує (!) в масиві
        fund = 100;
        balanceAfterFunding = fundBalance(ownerName, fund);
        if(balanceAfterFunding < 0) {
            System.out.println(ownerName + " NO");
        }
        else {
            System.out.println(ownerName + " " + (int) balanceAfterFunding);
        }
    }
}
