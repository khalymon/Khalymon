package module05.homework;

import java.time.Month;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class GoogleAPI implements API {
    private Room[] rooms;

    public GoogleAPI() {
        Calendar calendar = Calendar.getInstance();

        calendar.set(2016, Month.SEPTEMBER.getValue(), 1);
        rooms = new Room[]{
                new Room(1234L, 1000, 2, calendar.getTime(), "Royal", "London"),
                new Room(1245L, 1500, 2, calendar.getTime(), "Royal", "Paris"),
                new Room(1236L, 1000, 1, calendar.getTime(), "Royal", "London")
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
