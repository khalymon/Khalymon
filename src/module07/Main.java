package module07;

import java.util.*;
import java.util.function.Predicate;

import static module07.Currency.UAH;
import static module07.Currency.USD;

public class Main {

    private static User[] users = {
            new User(1000L, "Andriy", "Symyrenko", "Lviv", 1900_000_000),
            new User(1001L, "Andriy", "Symyrenko", "Kyiv", 1900_000_000),
            new User(1002L, "Petro", "Symyrenko", "Kharkiv", 1800_000_000),
            new User(1003L, "Petro", "Symyrenko", "Paris", 1800_000_000),
            new User(1004L, "Petro", "Symyrenko", "Lviv", 1800_000_000),
            new User(1005L, "Petro", "Symyrenko", "Kyiv", 1800_000_000),
            new User(1006L, "Andriy", "Petrov", "Lviv", 1200_000_000),
            new User(1007L, "Andriy", "Petrov", "Kyiv", 1200_000_000),
            new User(1008L, "Petro", "Petrov", "Lviv", 1000_000_000),
            new User(1008L, "Petro", "Petrov", "Kyiv", 1000_000_000),
    };

    private static Order[] orders = {
            new Order(9000L, 30_000_000, UAH, "bananas", "Ashan", users[0]),
            new Order(9001L, 2_000_000, USD, "bananas", "Ashan", users[1]),
            new Order(9002L, 30, UAH, "bananas", "Ashan", users[2]),
            new Order(9003L, 1_000_000, USD, "bananas", "Ashan", users[3]),
            new Order(9004L, 30_000_000, UAH, "coconut", "Ashan", users[4]),
            new Order(9005L, 1_000_000, USD, "bananas", "Billa", users[5]),
            new Order(9006L, 40_000_000, UAH, "coconut", "Billa", users[6]),
            new Order(9007L, 1_000_000, USD, "coconut", "Billa", users[7]),
            new Order(9008L, 40_000_000, UAH, "coconut", "Billa", users[8]),
            new Order(9008L, 40_000_000, UAH, "coconut", "Billa", users[9]),
    };

    private static void printSeparator(String s) {
        for (int i = 0; i < 80; i++) {
            System.out.print(s);
        }
        System.out.println();
    }

    private static boolean orderUserLastNameCheck(Collection<Order> orderCollection, String lastName) {
        for (Order element : orderCollection) {
            if (element.getUser().getLastName().equals(lastName)) {
                return true;
            }
        }
        return false;
    }

    private static void deleteOrdersWithCurrency(Collection<Order> orderCollection, Currency currency) {
        Iterator iterator = orderCollection.iterator();
        Order order;
        while (iterator.hasNext()) {
            order = (Order) iterator.next();
            if (order.getCurrency().equals(currency)) {
                iterator.remove();
            }
        }
    }

//    private static void deleteOrdersWithPriceLess(Collection<Order> orderCollection, int price) {
//        orderCollection.removeIf(ord -> ord.getPrice() < 1500);
//    }

    public static void main(String[] args) {
        //    List<User> userList = new LinkedList<User>();
        List<Order> orderList = new LinkedList<Order>();
        //    Set<User> userSet = new TreeSet<User>();
        Set<Order> orderSet;// = new TreeSet<Order>();

        Comparator byOrderPriceDecreasing = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1.equals(o2)) {
                    return 0;
                }
                if (o2 == null) {
                    return -1;
                }

                Order order1 = (Order) o1;
                Order order2 = (Order) o2;
                int intToCompare;

                intToCompare = order1.getPrice() - order2.getPrice();
                return -intToCompare;
            }
        };

        Comparator byOrderPriceIncreasingAndUserCity = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1.equals(o2)) {
                    return 0;
                }
                if (o2 == null) {
                    return 1;
                }

                Order order1 = (Order) o1;
                Order order2 = (Order) o2;
                int intToCompare;

                intToCompare = order1.getPrice() - order2.getPrice();
                if (intToCompare != 0) {
                    return intToCompare;
                }
                String city1 = order1.getUser().getCity();
                String city2 = order2.getUser().getCity();
                intToCompare = city1.compareTo(city2);
                return intToCompare;
            }
        };

        Comparator byItemNameAndShopIdentificatorAndUserCity = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1.equals(o2)) {
                    return 0;
                }
                if (o2 == null) {
                    return -1;
                }

                Order order1 = (Order) o1;
                Order order2 = (Order) o2;
                int intToCompare;

                intToCompare = order1.getItemName().compareTo(order2.getItemName());
                if (intToCompare != 0) {
                    return intToCompare;
                }
                intToCompare = order1.getShopIdentificator().compareTo(order2.getShopIdentificator());
                if (intToCompare != 0) {
                    return intToCompare;
                }
                return order1.getUser().getCity().compareTo(order2.getUser().getCity());
            }
        };

        orderSet = new TreeSet<Order>(byOrderPriceDecreasing);
        //   Collections.addAll(userList, users);
        Collections.addAll(orderList, orders);
        //    Collections.addAll(userSet, users,  byOrderPriceDecreasing);
        Collections.addAll(orderSet, orders);
        // orderSet.

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

        System.out.println("orderList, sorted byItemNameAndShopIdentificatorAndUserCity:");
        printSeparator("-");
        Collections.sort(orderList, byItemNameAndShopIdentificatorAndUserCity);
        System.out.println(new Order().ordersCollectionToString(orderList));
        printSeparator("=");

        System.out.println("Deleting orders with price < 1500...");
        printSeparator("-");
        orderList.removeIf(order -> order.getPrice() < 1500);
        System.out.println(new Order().ordersCollectionToString(orderList));
        printSeparator("=");

        System.out.println("orderUserLastNameCheck(orderSet, \"Petrov\") == " + orderUserLastNameCheck(orderSet, "Petrov"));
        printSeparator("=");

        System.out.println("Order largest price: ");
        System.out.println(orderSet.iterator().next().getPrice());
        printSeparator("=");

        System.out.println("Deleting orders with currency = USD...");
        printSeparator("-");
        deleteOrdersWithCurrency(orderSet, USD);
        System.out.println(new Order().ordersCollectionToString(orderSet));
        printSeparator("=");
    }
}
