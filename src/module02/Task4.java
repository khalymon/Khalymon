package module02;

public class Task4 {

/*
    Посмотри замечания (минусы) к третьему заданию, они почти все сюда применимы
*/
    static double fundBalance(String ownerName, double fund) {
        int[] balances = {1200, 250, 2000, 500, 3200};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
        int ownerID = -1;
        for (int i = 0; i < ownerNames.length; i++) {
            if (ownerNames[i].equals(ownerName)) {
                ownerID = i;
                break;
            }
        }
        if (ownerID == -1) {
            return -1;
        }
        return balances[ownerID] + fund;
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
