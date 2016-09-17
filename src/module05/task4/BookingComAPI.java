package module05.task4;

import module05.task1_2.Room;
import module05.task3.API;

import java.util.ArrayList;
import java.util.List;

import static module05.task7.Main.roomsGlobal;

public class BookingComAPI implements API {
    private Room[] rooms;

    public BookingComAPI() {
        rooms = roomsGlobal;
    }

    /*
    *  метод findRooms() класу BookingComAPI знаходить всі підходящі (за кошторисом int price,
    *  вмістимістю int persons та цільовим містом String city) кімнати
    * */

    public Room[] findRooms(int price, int persons, String city, String hotel) {
        List<Room> roomsList = new ArrayList<Room>();

        for (Room r : rooms) {
            if (r.equals(new Room(price, persons, hotel, city))) {
                roomsList.add(r);
            }
        }

        return (Room[]) roomsList.toArray();
    }

    public Room[] getRooms() {
        return rooms;
    }

    public void setRooms(Room[] rooms) {
        this.rooms = rooms;
    }
}