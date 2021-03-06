package module09;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    private static User[] users = {
            new User(1000L, "Andriy", "Symyrenko", "Lviv", 1900_000_000),
            new User(1001L, "Andriy", "Symyrenko", "Kyiv", 1900_000_000),
            new User(1002L, "Petro", "Symyrenko", "Kharkiv", 1800_000_000),
            new User(1003L, "Petro", "Symyrenko", "Paris", 1800_000_000),
            new User(1004L, "Petro", "Symyrenko", "Kharkiv", 1800_000_000),
            new User(1005L, "Petro", "Symyrenko", "Kyiv", 1800_000_000),
            new User(1006L, "Andriy", "Petrov", "Lviv", 1200_000_000),
            new User(1007L, "Andriy", "Petrov", "Kyiv", 1200_000_000),
            new User(1008L, "Petro", "Petrov", "Lviv", 1000_000_000),
            new User(1008L, "Petro", "Petrov", "Lviv", 1000_000_000),
    };

    private static Order[] orders = {
            new Order(9000L, 30_000_000, Currency.UAH, "bananas", "Ashan", users[0]),
            new Order(9001L, 2_000_000, Currency.USD, "bananas", "Ashan", users[1]),
            new Order(9002L, 30, Currency.UAH, "bananas", "Ashan", users[2]),
            new Order(9003L, 1_000_000, Currency.USD, "bananas", "Ashan", users[3]),
            new Order(9004L, 30_000_000, Currency.UAH, "coconut", "Ashan", users[4]),
            new Order(9005L, 1_000_000, Currency.USD, "bananas", "Billa", users[5]),
            new Order(9006L, 40_000_000, Currency.UAH, "coconut", "Billa", users[6]),
            new Order(9007L, 1_000_000, Currency.USD, "coconut", "Billa", users[7]),
            new Order(9008L, 40_000_000, Currency.UAH, "coconut", "Billa", users[8]),
            new Order(9008L, 40_000_000, Currency.UAH, "coconut", "Billa", users[8]),
    };

    private static void printSeparator(String s) {
        for (int i = 0; i < 80; i++) {
            System.out.print(s);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<Order> orderList;
        Set<Order> orderSet;

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
        orderList = new LinkedList<Order>();
        Collections.addAll(orderList, orders);
        Collections.addAll(orderSet, orders);

        System.out.println("[orderList]. Sorted byOrderPriceDecreasing:");
        printSeparator("-");
        Collections.sort(orderList, byOrderPriceDecreasing);
        System.out.println(Order.ordersCollectionToString(orderList));
        printSeparator("=");

        System.out.println("[orderList]. Sorted byItemNameAndShopIdentificatorAndUserCity:");
        printSeparator("-");
        Collections.sort(orderList, byItemNameAndShopIdentificatorAndUserCity);
        System.out.println(Order.ordersCollectionToString(orderList));
        printSeparator("=");

        System.out.println("[orderList]. Deleting duplicates...");
        printSeparator("-");
        orderList = new ArrayList<>(orderList.stream().collect(Collectors.toMap(p -> p, p -> p, (p, q) -> p)).values());
        Collections.sort(orderList);
        System.out.println(Order.ordersCollectionToString(orderList));
        printSeparator("=");

        System.out.println("[orderList]. Deleting orders with price < 1500...");
        printSeparator("-");
        orderList.removeIf(order -> order.getPrice() < 1500);
        System.out.println(Order.ordersCollectionToString(orderList));
        printSeparator("=");

        System.out.println("[orderList]. Separating by currency...");
        printSeparator("-");
        System.out.println(orderList.stream().collect(Collectors.groupingBy(Order::getCurrency)).toString());
        printSeparator("=");

        System.out.println("[orderList]. Separating by cities...");
        printSeparator("-");
        System.out.println(orderList.stream().collect(Collectors.groupingBy(p -> p.getUser().getCity())).toString());
        printSeparator("=");

        System.out.println("[orderSet]. orderUserLastNameCheck(orderSet, \"Petrov\") == "
                + orderSet.stream().anyMatch(s -> s.getUser().getLastName().equals("Petrov")));
        printSeparator("=");

        System.out.println("[orderSet]. Order largest price: ");
        printSeparator("-");
        System.out.println(((Order) orderSet.stream().min(byOrderPriceDecreasing).get()).getPrice());
        printSeparator("=");

        System.out.println("[orderSet]. Deleting orders with currency = USD...");
        printSeparator("-");
        orderSet.stream().filter(s -> !s.getCurrency().equals(Currency.USD));
        System.out.println(Order.ordersCollectionToString(orderSet));
        printSeparator("=");
    }
}
