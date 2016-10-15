package module07.task4;

public interface API {

    Room[] findRooms(int price, int persons, String hotel, String city);

    Room[] getAll();

}
