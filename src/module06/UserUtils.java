package module06;

public class UserUtils {

    public User[] uniqueUsersForPos(User[] users, int pos) {
        // correct position values: pos = 0..(users.length-2)
        User[] immutableUsers = new User[pos];
        for (int i = 0; i < pos; i++) {
            immutableUsers[i] = users[i];
        }

        int mutableLengthCounter = 0;
        for (int i = pos + 1; i < users.length; i++) {
            if (users[pos].getId() == users[i].getId()) {
                mutableLengthCounter++;
            }
        }

        User[] mutableUsers = new User[users.length - pos - mutableLengthCounter];
        mutableUsers[0] = users[pos];
        for (int i = pos + 1; i < users.length; i++) {
            if (users[pos].getId() != users[i].getId()) {
                mutableUsers[1 + mutableUsers.length - mutableLengthCounter] = users[i];
            } else {
                mutableLengthCounter--;
            }
        }

        User[] toReturn = new User[immutableUsers.length + mutableUsers.length];
        for (int i = 0; i < immutableUsers.length; i++) {
            toReturn[i] = immutableUsers[i];
        }
        for (int i = 0; i < mutableUsers.length; i++) {
            toReturn[i + immutableUsers.length] = mutableUsers[i];
        }

        return toReturn;
    }

    public User[] uniqueUsers(User[] users) {
        User[] usersToReturn = deleteEmptyUsers(users);

        if (usersToReturn.length == 1) {
            return usersToReturn;
        } else {
            int posCounter = 0;
            do {
                usersToReturn = uniqueUsersForPos(usersToReturn, posCounter);
                posCounter--;
            }
            while (posCounter <= usersToReturn.length - 2);
            return usersToReturn;
        }

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
            } else {
                emptyUsersCounter--;
            }
        }

        return toReturn;
    }
}
