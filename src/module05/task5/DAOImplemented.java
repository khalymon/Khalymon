package module05.task5;

import module05.task1_2.Room;

import java.util.Random;

import static module05.task7.Main.roomsGlobal;

public class DAOImplemented implements DAO {
    public Room save(Room room) {
        System.out.println("Room " + room.toString() + " has been saved.");
        return room;
    }


    public boolean delete(Room room) {
        final Random random = new Random();
        if (random.nextBoolean()) {
            System.out.println("Room " + room.toString() + " has been deleted.");
            return true;
        } else {
            System.out.println("Couldn't delete room " + room.toString() + " : there's no such room in the Base.");
            return false;
        }
    }


    public Room update(Room room) {
        System.out.println("Room " + room.toString() + " has been updated.");
        return room;
    }


    public Room findById(long id) {
        for (Room r : roomsGlobal) {
            if (r.getId() == id) {
                System.out.println("Room " + r.toString() + "has been found.");
                return r;
            }
        }
        System.out.println("Couldn't find room with such id: " + id);
        return null;
    }


}
