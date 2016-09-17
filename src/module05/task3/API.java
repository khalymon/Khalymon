package module05.task3;

import module05.task1_2.Room;

public interface API {
    Room[] findRooms(int price, int persons, String hotel, String city);
}
