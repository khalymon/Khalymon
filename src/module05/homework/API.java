package module05.homework;

public interface API {

    Room[] findRooms(int price, int persons, String hotel, String city);

    Room[] getAll();

}
