package module05;

import java.time.Month;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class BookingComAPI implements API {

    private Room[] rooms;

    public BookingComAPI() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2016, Month.SEPTEMBER.getValue(), 1);
        rooms = new Room[]{
                new Room(1100L, 1500, 2, calendar.getTime(), "Royal", "Paris"),
                new Room(1101L, 1000, 1, calendar.getTime(), "Royal", "London"),
                new Room(1102L, 2500, 2, calendar.getTime(), "Intercontinental", "Paris"),
        };
    }

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