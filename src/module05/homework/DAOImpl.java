package module05.homework;

import java.time.Month;
import java.util.Calendar;

public class DAOImpl implements DAO {
    public Room save(Room room) {
        System.out.println("Room " + room.toString() + " has been saved.");
        return room;
    }

    public boolean delete(Room room) {
        System.out.println("Room " + room.toString() + " has been deleted.");
        return true;
    }

    public Room update(Room room) {
        System.out.println("Room " + room.toString() + " has been updated.");
        return room;
    }

    public Room findById(long id) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2016, Month.DECEMBER.getValue(), 30);
        Room room = new Room(1938L, 1500, 2, calendar.getTime(), "InterContinental", "Paris");
        System.out.println("Room " + room.toString() + "has been found.");
        return room;
    }


}
