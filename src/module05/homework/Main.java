package module05.homework;

import java.time.Month;
import java.util.Calendar;
import java.util.List;

public class Main {
//    public static Room[] roomsGlobal = new Room[5];
//    public static API[] apisGlobal = new API[3];

    public static void printRooms(Room[] rooms) {
        if (rooms != null) {
            if (rooms.length != 0) {
                for (int i = 0; i < rooms.length; i++) {
                    if(rooms[i]!=null) {
                        System.out.print(rooms[i].toString());
                    }
                }
            } else {
                System.out.print("There's no such rooms.");
            }
        }
        System.out.println();
    }

//    static {
//        Calendar calendar = Calendar.getInstance();
//
//        calendar.set(2016, Month.SEPTEMBER.getValue(), 1);
//        roomsGlobal[0] = new Room(1234L, 1000, 1, calendar.getTime(), "Royal", "London");
//
//        calendar.set(2016, Month.SEPTEMBER.getValue(), 3);
//        roomsGlobal[1] = new Room(1235L, 1500, 1, calendar.getTime(), "InterContinental", "Paris");
//
//        calendar.set(2017, Month.JANUARY.getValue(), 1);
//        roomsGlobal[2] = new Room(1236L, 2500, 2, calendar.getTime(), "InterContinental", "Paris");
//
//        calendar.set(2016, Month.OCTOBER.getValue(), 15);
//        roomsGlobal[3] = new Room(1237L, 2500, 2, calendar.getTime(), "InterContinental", "Paris");
//
//        calendar.set(2016, Month.DECEMBER.getValue(), 31);
//        roomsGlobal[4] = new Room(1238L, 2500, 2, calendar.getTime(), "InterContinental", "Paris");
//
//    }
//
//    static {
//        apisGlobal[0] = new BookingComAPI();
//        apisGlobal[1] = new GoogleAPI();
//        apisGlobal[2] = new TripAdvisorAPI();
//    }


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
            System.out.println("Перетин всіх трьох API:");
            printRooms(controller.requestedRooms(pricesT[j], persons_T[j], hotelNamesT[j], cityNamesT[j]));
            System.out.println("=============================================================================");
            System.out.println("=============================================================================");
        }

    }
}
