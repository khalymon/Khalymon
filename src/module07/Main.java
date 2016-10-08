package module07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static module07.Currency.UAH;
import static module07.Currency.USD;

public class Main {

    public static void main(String[] args) {
        User[] users = {
                new User(1000L, "Andriy", "Symyrenko", "Lviv", 1900),
                new User(1001L, "Andriy", "Symyrenko", "Kyiv", 1900),
                new User(1002L, "Petro", "Symyrenko", "Lviv", 1800),
                new User(1003L, "Petro", "Symyrenko", "Kyiv", 1800),
                new User(1004L, "Petro", "Symyrenko", "Lviv", 1800),
                new User(1005L, "Petro", "Symyrenko", "Kyiv", 1800),
                new User(1006L, "Andriy", "Petrov", "Lviv", 1200),
                new User(1007L, "Andriy", "Petrov", "Kyiv", 1200),
                new User(1008L, "Petro", "Petrov", "Lviv", 1000),
                new User(1008L, "Petro", "Petrov", "Kyiv", 1000),
        };

        Order[] orders = {
                new Order(9000L, 30, UAH, "bananas", "Ashan", users[0]),
                new Order(9001L, 2, USD, "bananas", "Ashan", users[1]),
                new Order(9002L, 30, UAH, "bananas", "Ashan", users[2]),
                new Order(9003L, 1, USD, "bananas", "Ashan", users[3]),
                new Order(9004L, 30, UAH, "coconut", "Ashan", users[4]),
                new Order(9005L, 1, USD, "bananas", "Billa", users[5]),
                new Order(9006L, 40, UAH, "coconut", "Billa", users[6]),
                new Order(9007L, 1, USD, "coconut", "Billa", users[7]),
                new Order(9008L, 40, UAH, "coconut", "Billa", users[8]),
                new Order(9008L, 40, UAH, "coconut", "Billa", users[9]),
        };

        List<User> userList = new ArrayList<User>();
        List<Order> orderList = new ArrayList<Order>();

        Collections.addAll(userList, users);
        Collections.addAll(orderList, orders);

        System.out.println(userList.toString());
        System.out.println(orderList.toString());






    }
}
