package module09.task4;

import java.util.List;

public class Main {
    public static void printRooms(List<Room> rooms) {
        if (rooms != null) {
            if (rooms.size() != 0) {
                rooms.stream().filter(aList -> aList != null).forEachOrdered(aList -> {
                    System.out.println(aList.toString());
                });
            } else {
                System.out.print("There's no such rooms.");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Controller controller = new Controller();
        int[] pricesT = {1500, 1000, 2500};
        int[] persons_T = {2, 1, 2};
        String[] hotelNamesT = {"Royal", "Royal", "InterContinental"};
        String[] cityNamesT = {"Paris", "London", "Paris"};

        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 3; i++) {
                System.out.println("Кімнати, знайдені " + i + "-м API:");
                printRooms(controller.getApis()[i].findRooms(pricesT[j], persons_T[j], hotelNamesT[j], cityNamesT[j]));
                System.out.println("--------------------------------------------------------------------------");
            }
            System.out.println("Перетин TripAdvisorAPI та GoogleAPI:");
            printRooms(controller.check(controller.getApis()[2], controller.getApis()[1], pricesT[j], persons_T[j], hotelNamesT[j], cityNamesT[j]));
            System.out.println("--------------------------------------------------------------------------");
            System.out.println("Кімнати, знайдені всіма API:");
            printRooms(controller.requestedRooms(pricesT[j], persons_T[j], hotelNamesT[j], cityNamesT[j]));
            System.out.println("=============================================================================");
            System.out.println("=============================================================================");
        }

    }
}
