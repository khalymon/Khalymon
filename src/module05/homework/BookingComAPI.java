package module05.homework;

import java.time.Month;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class BookingComAPI implements API {

    private Room[] rooms;

    public BookingComAPI() {
        Calendar calendar = Calendar.getInstance();
        // init another APIs!!!
        calendar.set(2016, Month.SEPTEMBER.getValue(), 1);
        rooms = new Room[]{
                new Room(1234L, 1000, 1, calendar.getTime(), "Royal", "London"),
                new Room(1235L, 1000, 1, calendar.getTime(), "Royal", "London"),
                new Room(1236L, 1000, 1, calendar.getTime(), "Royal", "London")
        };
    }

    /*
    *  метод findRooms() класу BookingComAPI знаходить всі підходящі (за кошторисом int price,
    *  вмістимістю int persons та цільовим містом String city) кімнати
    * */


    public Room[] findRooms(int price, int persons, String hotel, String city) {
        List<Room> roomsList = new ArrayList<Room>();
        Room lookingRoom = new Room(0L, price, persons, Calendar.getInstance().getTime(), hotel, city);
        for (Room room : rooms) {
            if (room.equals(lookingRoom)) {
                roomsList.add(room);
            }
        }
        return roomsList.toArray(new Room[roomsList.size()]);
    }

    @Override
    public Room[] getAll() {
        return rooms;
    }

}