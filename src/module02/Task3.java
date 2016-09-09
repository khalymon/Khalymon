package module02;

public class Task3 {

    /*
    Обычно модификатор доступа у финальной статической переменной private
     */
    public static final double commission = 0.05;

    /*
    Да это уже то решение которое хотелось увидеть
    по желанию можешь улучшить разделив жто решение
    на отдельные методы

    минус твоего решения:
    что произовйдет если в базе не окажется имени которое ты ищешь?
     */
    static double withdrawBalance(String ownerName, double withdrawal) {
        int[] balances = {1200, 250, 2000, 500, 3200};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

//        Begining метод поиска индекса
        int ownerID = -1;
        for (int i = 0; i < ownerNames.length; i++) {
            if (ownerNames[i].equals(ownerName)) {
                ownerID = i;
                break;
            }
        }
//        End метод поиска индекса

        double balance = balances[ownerID];
//      метод из предыдущего задания  withdrawBalance(double balance, double withdrawal)
        return balance - (commission + 1) * withdrawal;
    }

    public static void main(String[] args) {
        String ownerName = "Ann";
        double withdrawal = 100;
        double balanceAfterWithdrawal = withdrawBalance(ownerName, withdrawal);

        System.out.print(ownerName + " ");
        if (balanceAfterWithdrawal < 0) {
//            System.out.println("NO");
            System.out.println(ownerName + " NO");
        } else {
//            System.out.println((int) withdrawal + " " + (int) balanceAfterWithdrawal);
//          В условии было написано выводить "Print name + NO of withdrawal fs not possible
//          and name + sum of withdrawal + balance after withdrawal in other case."
            System.out.println(ownerName + " " + withdrawal + " " + balanceAfterWithdrawal);
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
