package module06;

public class UserUtils {
    public User[] uniqueUsers(User[] users) {
        return null;
    }


    public User[] usersWithConditionalBalance(User[] users, int balance) {
        int usersWithConditionalBalanceCounter = 0;

        for (int i = 0; i < users.length; i++) {
            if (users[i].getBalance() == balance) {
                usersWithConditionalBalanceCounter++;
            }
        }

        User[] toReturn = new User[usersWithConditionalBalanceCounter];
        for (int i = 0; i < users.length; i++) {
            if (users[i].getBalance() == balance) {
                toReturn[toReturn.length - usersWithConditionalBalanceCounter] = users[i];
                usersWithConditionalBalanceCounter--;
            }
        }

        return toReturn;
    }


    public final User[] paySalaryToUsers(User[] users) {
        User[] toReturn = users;

        for (int i = 0; i < toReturn.length; i++) {
            toReturn[i].setBalance(toReturn[i].getBalance() + toReturn[i].getSalary());
        }

        return toReturn;
    }


    public final long[] getUsersId(User[] users) {
        long[] toReturn = new long[users.length];
        for (int i = 0; i < users.length; i++) {
            toReturn[i] = users[i].getId();
        }
        return toReturn;
    }

    public User[] deleteEmptyUsers(User[] users) {
        int emptyUsersCounter = 0;
        for (int i = 0; i < users.length; i++) {
            if (users[i].isEmpty()) {
                emptyUsersCounter++;
            }
        }

        User[] toReturn = new User[users.length - emptyUsersCounter];

        for (int i = 0; i < users.length; i++) {
            if (!users[i].isEmpty()) {
                toReturn[toReturn.length - emptyUsersCounter] = users[i];
                emptyUsersCounter--;
            }
        }

        return toReturn;
    }
}
