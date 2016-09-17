package module05.task4;

import module05.task1_2.Room;
import module05.task3.API;

import java.util.ArrayList;
import java.util.List;

import static module05.task7.Main.MyToArray;
import static module05.task7.Main.roomsGlobal;

public class TripAdvisorAPI implements API {

    private Room[] rooms;

    public TripAdvisorAPI() {
        rooms = roomsGlobal;
    }

    /*
    *  findRooms() класу TripAdvisorAPI знаходить всі кімнати, оренда яких
    *  не дорожча за кошторис int price
    * */

    public Room[] findRooms(int price, int persons, String hotel, String city) {
        List<Room> roomsList = new ArrayList<Room>();

        for (Room r : rooms) {
            if (r.getPrice() <= price) {
                roomsList.add(r);
            }
        }

        return MyToArray(roomsList);
    }

    public Room[] getRooms() {
        return rooms;
    }

    public void setRooms(Room[] rooms) {
        this.rooms = rooms;
    }
}
