package module05;

public interface API {

    Room[] findRooms(int price, int persons, String hotel, String city);

    Room[] getAll();

}
