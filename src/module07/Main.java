package module07;

import java.util.*;

import static module07.Currency.UAH;
import static module07.Currency.USD;

public class Main {

    private static User[] users = {
            new User(1000L, "Andriy", "Symyrenko", "Lviv", 1900),
            new User(1001L, "Andriy", "Symyrenko", "Kyiv", 1900),
            new User(1002L, "Petro", "Symyrenko", "Kharkiv", 1800),
            new User(1003L, "Petro", "Symyrenko", "Paris", 1800),
            new User(1004L, "Petro", "Symyrenko", "Lviv", 1800),
            new User(1005L, "Petro", "Symyrenko", "Kyiv", 1800),
            new User(1006L, "Andriy", "Petrov", "Lviv", 1200),
            new User(1007L, "Andriy", "Petrov", "Kyiv", 1200),
            new User(1008L, "Petro", "Petrov", "Lviv", 1000),
            new User(1008L, "Petro", "Petrov", "Kyiv", 1000),
    };

    private static Order[] orders = {
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

    private static void printSeparator(String s) {
        for (int i = 0; i < 80; i++) {
            System.out.print(s);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<User> userList = new LinkedList<User>();
        List<Order> orderList = new LinkedList<Order>();
        Set<User> userSet = new TreeSet<User>();
        Set<Order> orderSet = new TreeSet<Order>();

        Comparator byOrderPriceDecreasing = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Order order1 = (Order) o1;
                Order order2 = (Order) o2;
                if ((order1 == null) && (order2 == null)) {
                    return 0;
                }
                if ((order1 == null) && (order2 != null)) {
                    return 1;
                }
                if ((order1 != null) && (order2 == null)) {
                    return -1;
                }
                int intToCompare = order1.getPrice() - order2.getPrice();
                return Integer.signum(-intToCompare);
            }
        };

        Comparator byOrderPriceIncreasingAndUserCity = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Order order1 = (Order) o1;
                Order order2 = (Order) o2;
                if ((order1 == null) && (order2 == null)) {
                    return 0;
                }
                if ((order1 == null) && (order2 != null)) {
                    return -1;
                }
                if ((order1 != null) && (order2 == null)) {
                    return 1;
                }
                int intToCompare = order1.getPrice() - order2.getPrice();
                if (intToCompare != 0) {
                    return intToCompare;
                }
                String city1 = order1.getUser().getCity();
                String city2 = order2.getUser().getCity();
                intToCompare = city1.compareTo(city2);
                return Integer.signum(intToCompare);
            }
        };

        Collections.addAll(userList, users);
        Collections.addAll(orderList, orders);
        Collections.addAll(userSet, users);
        Collections.addAll(orderSet, orders);

        printSeparator("=");
        System.out.println("orderList, sorted by natural compareTo():");
        printSeparator("-");
        Collections.sort(orderList);
        System.out.println(new Order().ordersCollectionToString(orderList));
        printSeparator("=");

        System.out.println("orderList, sorted byOrderPriceDecreasing:");
        printSeparator("-");
        Collections.sort(orderList, byOrderPriceDecreasing);
        System.out.println(new Order().ordersCollectionToString(orderList));
        printSeparator("=");


    }
}
