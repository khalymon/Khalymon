package module09.task4;

import java.time.Month;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.stream.Collectors;

public class GoogleAPI implements API {
    private List<Room> rooms;

    public GoogleAPI() {
        Calendar calendar = Calendar.getInstance();

        calendar.set(2016, Month.SEPTEMBER.getValue(), 1);
        rooms = new ArrayList<Room>();
        rooms.add(new Room(1200L, 1500, 2, calendar.getTime(), "Royal", "Paris"));
        rooms.add(new Room(1201L, 1000, 1, calendar.getTime(), "Royal", "London"));
        rooms.add(new Room(1202L, 2500, 2, calendar.getTime(), "Intercontinental", "Paris"));
    }

    public List<Room> findRooms(int price, int persons, String hotel, String city) {
        List<Room> roomsList = new ArrayList<Room>();
        Room lookingRoom = new Room(0L, price, persons, Calendar.getInstance().getTime(), hotel, city);
        roomsList.addAll(rooms.stream().filter(room -> room.equals(lookingRoom)).collect(Collectors.toList()));
        return roomsList;
    }

    @Override
    public List<Room> getAll() {
        return rooms;
    }
}
