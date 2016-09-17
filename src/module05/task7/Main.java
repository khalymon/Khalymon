package module05.task7;

import module05.task1_2.Room;
import module05.task3.API;
import module05.task4.BookingComAPI;
import module05.task4.GoogleAPI;
import module05.task4.TripAdvisorAPI;
import module05.task6.Controller;

import java.time.Month;
import java.util.Calendar;
import java.util.List;

public class Main {
    public static Room[] roomsGlobal = new Room[5];
    public static API[] apisGlobal = new API[3];

    public static void printRooms(Room[] rooms) {
        if (rooms != null) {
            for (int i = 0; i < rooms.length; i++) {
                System.out.println(rooms[i].toString());
            }
        } else {
            System.out.println("There's no such rooms.");
        }
    }

    public static Room[] MyToArray(List<Room> roomList) {
        if (roomList == null) {
            return null;
        } else {
            Room[] toReturn = new Room[roomList.size()];
            for (int i = 0; i < roomList.size(); i++) {
                toReturn[i] = roomList.get(i);
            }
            return toReturn;
        }
    }

    static {
        Calendar calendar = Calendar.getInstance();

        calendar.set(2016, Month.SEPTEMBER.getValue(), 1);
        roomsGlobal[0] = new Room(1234L, 1000, 1, calendar.getTime(), "Royal", "London");

        calendar.set(2016, Month.SEPTEMBER.getValue(), 3);
        roomsGlobal[1] = new Room(1235L, 1500, 1, calendar.getTime(), "InterContinental", "Paris");

        calendar.set(2017, Month.JANUARY.getValue(), 1);
        roomsGlobal[2] = new Room(1236L, 2500, 2, calendar.getTime(), "InterContinental", "Paris");

        calendar.set(2016, Month.OCTOBER.getValue(), 15);
        roomsGlobal[3] = new Room(1237L, 2500, 2, calendar.getTime(), "InterContinental", "Paris");

        calendar.set(2016, Month.DECEMBER.getValue(), 31);
        roomsGlobal[4] = new Room(1238L, 2500, 2, calendar.getTime(), "InterContinental", "Paris");

    }

    static {
        apisGlobal[0] = new BookingComAPI();
        apisGlobal[1] = new GoogleAPI();
        apisGlobal[2] = new TripAdvisorAPI();
    }


    public static void main(String[] args) {
        Controller controller = new Controller();
        int[] pricesT = {1500, 1000, 2500};
        int[] persons_T = {2, 1, 2};
        String[] hotelNamesT = {"InterContinental", "Royal", "InterContinental"};
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
