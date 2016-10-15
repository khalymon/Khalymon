package module07.task4;

import java.util.List;

public interface API {

    List<Room> findRooms(int price, int persons, String hotel, String city);

    List<Room> getAll();

}
