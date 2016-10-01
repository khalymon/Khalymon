package module06;

import java.util.Arrays;

public class UserUtils {

    public static User[] uniqueUsers(User[] users) {
        users = deleteEmptyUsers(users);

        User[] result = new User[0];

        for (User user : users) {
            boolean flag = !isContains(result, user);

            if (flag) {
                result = addUser(result, user);
            }
        }

        return result;
    }

    private static User[] addUser(User[] users, User user) {
        User[] result = Arrays.copyOf(users, users.length + 1);
        result[result.length - 1] = user;
        return result;
    }

    private static boolean isContains(User[] users, User user) {
        for (User key : users) {
            if (user.equals(key)) {
                return true;
            }
        }
        return false;
    }


    public static User[] usersWithConditionalBalance(User[] users, int balance) {
        users = uniqueUsers(users);
        User[] result = new User[0];
        for (User user : users) {
            if (user.getBalance() == balance) {
                result = addUser(result, user);
            }
        }
        return result;
    }

    public static User[] paySalaryToUsers(User[] users) {
        users = uniqueUsers(users);
        for (User user : users) {
            user.setBalance(user.getBalance() + user.getSalary());
        }
        return users;
    }

    public static long[] getUsersId(User[] users) {
        // users = deleteEmptyUsers(users);
        users = uniqueUsers(users);
        long[] result = new long[users.length];
        for (int i = 0; i < users.length; i++) {
            result[i] = users[i].getId();
        }
        return result;
    }

    public static User[] deleteEmptyUsers(User[] users) {
        User[] result = new User[0];
        for (User user : users) {
            if (user != null) {
                result = addUser(result, user);
            }
        }
        return result;
    }
}
