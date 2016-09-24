package module06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UserUtils {

    private User[] uniqueUsersForPos(User[] users, int pos) {
        List<User> list = new ArrayList<User>();
        User[] toReturn;
        Collections.addAll(list, users);
        for (int i = pos + 1; i < list.size(); i++) {
            if (list.get(pos).getId() == list.get(i).getId()) {
                list.remove(i);
            }
        }
        toReturn = new User[list.size()];
        for (int i = 0; i < list.size(); i++) {
            toReturn[i] = list.get(i);
        }
        return toReturn;
    }


    public User[] uniqueUsers(User[] users) {
        User[] usersToReturn = deleteEmptyUsers(users);

        if (usersToReturn.length == 1) {
            return usersToReturn;
        } else {
            int posCounter = 0;

            while (posCounter <= usersToReturn.length - 2) {
                usersToReturn = uniqueUsersForPos(usersToReturn, posCounter);
                posCounter++;
            }
            return usersToReturn;
        }

    }

    public User[] usersWithConditionalBalance(User[] users, int balance) {
        int usersWithConditionalBalanceCounter = 0;
        User[] toReturn;

        for (int i = 0; i < users.length; i++) {
            if (users[i].getBalance() == balance) {
                usersWithConditionalBalanceCounter++;
            }
        }

        toReturn = new User[usersWithConditionalBalanceCounter];
        int j = 0; // допоміжна змінна циклу
        for (int i = 0; i < users.length; i++) {
            if (users[i].getBalance() == balance) {
                toReturn[j] = users[i];
                j++;
            }
        }

        return toReturn;
    }


    public final User[] paySalaryToUsers(User[] users) {
        User[] toReturn = deleteEmptyUsers(users);

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

        User[] toReturn;

        for (int i = 0; i < users.length; i++) {
            if (users[i].isEmpty()) {
                emptyUsersCounter++;
            }
        }


        toReturn = new User[users.length - emptyUsersCounter];

        int j = 0; // допоміжна змінна циклу
        for (int i = 0; i < users.length; i++) {
            if (!users[i].isEmpty()) {
                toReturn[j] = users[i];
                j++;
            }
        }

        return toReturn;
    }
}
