package module05.task7;

import module05.task1_2.Room;
import module05.task3.API;
import module05.task4.BookingComAPI;
import module05.task4.GoogleAPI;
import module05.task4.TripAdviserAPI;
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
            return null;
        }
    }

    static {
        Calendar calendar = Calendar.getInstance();

        calendar.set(2016, Month.SEPTEMBER.getValue(), 1);
        roomsGlobal[0] = new Room(1234L, 2500, 2, calendar.getTime(), "InterContinental", "Paris");

        calendar.set(2016, Month.SEPTEMBER.getValue(), 3);
        roomsGlobal[1] = new Room(1235L, 2500, 2, calendar.getTime(), "InterContinental", "Paris");

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
        apisGlobal[2] = new TripAdviserAPI();
    }


    public static void main(String[] args) {
        Controller controller = new Controller();
        //   Controller.apis
        int[] pricesT = {2500, 2500, 2500};
        int[] persons_T = {2, 2, 2};
        String[] hotelNamesT = {"InterContinental", "InterContinental", "InterContinental"};
        String[] cityNamesT = {"Paris", "Paris", "Paris"};

        for (int j = 0; j < 3; j++) {
            controller.getApis()[0] = new BookingComAPI();
            controller.getApis()[1] = new GoogleAPI();
            controller.getApis()[2] = new TripAdviserAPI();
            for (int i = 0; i < 3; i++) {
                printRooms(controller.getApis()[i].findRooms(pricesT[j], persons_T[j], hotelNamesT[j], cityNamesT[j]));
            }
            printRooms(controller.check(controller.getApis()[2], controller.getApis()[1], pricesT[j], persons_T[j], hotelNamesT[j], cityNamesT[j]));
            printRooms(controller.requestedRooms(pricesT[j], persons_T[j], hotelNamesT[j], cityNamesT[j]));
            System.out.println("============");
        }

    }
}
