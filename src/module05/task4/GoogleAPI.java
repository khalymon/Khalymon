package module05.task4;

import module05.task1_2.Room;
import module05.task3.API;

import java.util.ArrayList;
import java.util.List;

import static module05.task7.Main.MyToArray;
import static module05.task7.Main.roomsGlobal;

public class GoogleAPI implements API {

    private Room[] rooms;

    public GoogleAPI() {
        rooms = roomsGlobal;
    }

    /*
    *  findRooms() класу GoogleAPI знаходить всі кімнати цільового готелю String hotel
    * */

    public Room[] findRooms(int price, int persons, String city, String hotel) {
        List<Room> roomsList = new ArrayList<Room>();

        for (Room r : rooms) {
            if (r.getHotelName().equals(hotel)) {
                roomsList.add(r);
            }
        }

    //    return (Room[]) roomsList.toArray();
        return MyToArray(roomsList);
    }

    public Room[] getRooms() {
        return rooms;
    }

    public void setRooms(Room[] rooms) {
        this.rooms = rooms;
    }
}
