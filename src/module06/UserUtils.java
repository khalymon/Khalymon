package module06;

public class UserUtils {

    private User[] uniqueUsersForPos(User[] users, int pos) {
        // correct position values: pos = 0..(users.length-2)
        User[] immutableUsers;// = new User[pos];
        User[] mutableUsers;
        User[] toReturn;

        if (pos == 0) {

            int mutableLengthCounter = 0;
            for (int i = pos + 1; i < users.length; i++) {
                if (users[pos].getId() == users[i].getId()) {
                    mutableLengthCounter++;
                }
            }

            mutableUsers = new User[users.length - pos - mutableLengthCounter];
            mutableUsers[0] = users[pos];
            int j = 0; // допоміжна змінна циклу
            for (int i = pos + 1; i < users.length; i++) {
                if (users[pos].getId() != users[i].getId()) {
                    mutableUsers[j] = users[i];
                    j++;
                }
            }

            toReturn = new User[mutableUsers.length];
            for (int i = 0; i < mutableUsers.length; i++) {
                toReturn[i] = mutableUsers[i];
            }

            return toReturn;



        } else {
            immutableUsers = new User[pos];

            for (int i = 0; i < pos; i++) {
                immutableUsers[i] = users[i];
            }

            int mutableLengthCounter = 0;
            for (int i = pos + 1; i < users.length; i++) {
                if (users[pos].getId() == users[i].getId()) {
                    mutableLengthCounter++;
                }
            }

            mutableUsers = new User[users.length - pos - mutableLengthCounter];
            mutableUsers[0] = users[pos];
            int j = 0; // допоміжна змінна циклу
            for (int i = pos + 1; i < users.length; i++) {
                if (users[pos].getId() != users[i].getId()) {
                    mutableUsers[j] = users[i];
                    j++;
                }
            }

            toReturn = new User[immutableUsers.length + mutableUsers.length];
            for (int i = 0; i < immutableUsers.length; i++) {
                toReturn[i] = immutableUsers[i];
            }
            for (int i = 0; i < mutableUsers.length; i++) {
                toReturn[i + immutableUsers.length] = mutableUsers[i];
            }

            return toReturn;
        }

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
