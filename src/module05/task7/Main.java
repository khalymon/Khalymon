package module05.task7;

import module05.task1_2.Room;
import module05.task3.API;
import module05.task4.BookingComAPI;
import module05.task4.GoogleAPI;
import module05.task4.TripAdviserAPI;

import java.time.Month;
import java.util.Calendar;

public class Main {
    public static Room[] roomsGlobal = new Room[5];
    public static API[] apisGlobal = new API[3];

    static {
        Calendar calendar = Calendar.getInstance();

        calendar.set(2016, Month.SEPTEMBER.getValue(), 1);
        Room room = new Room(1234L, 1000, 1, calendar.getTime(), "hotel_01", "city_01");
        roomsGlobal[0] = room;

        calendar.set(2016, Month.SEPTEMBER.getValue(), 3);
        room = new Room(1235L, 1500, 1, calendar.getTime(), "hotel_02", "city_02");
        roomsGlobal[1] = room;

        calendar.set(2017, Month.JANUARY.getValue(), 1);
        room = new Room(1236L, 2500, 2, calendar.getTime(), "hotel_02", "city_02");
        roomsGlobal[2] = room;

        calendar.set(2016, Month.OCTOBER.getValue(), 15);
        room = new Room(1237L, 2500, 2, calendar.getTime(), "hotel_01", "city_02");
        roomsGlobal[3] = room;

        calendar.set(2016, Month.DECEMBER.getValue(), 31);
        room = new Room(1238L, 2500, 2, calendar.getTime(), "hotel_02", "city_02");
        roomsGlobal[4] = room;

    }

    static {
        apisGlobal[0] = new BookingComAPI();
        apisGlobal[1] = new GoogleAPI();
        apisGlobal[2] = new TripAdviserAPI();
    }

    public static void main(String[] args) {
        System.out.println("Here");
    }
}
