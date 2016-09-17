package module05.task6;

import module05.task1_2.Room;
import module05.task3.API;
import module05.task4.BookingComAPI;
import module05.task4.GoogleAPI;
import module05.task4.TripAdviserAPI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static module05.task7.Main.apisGlobal;

public class Controller {
    private API[] apis = apisGlobal;

    public Room[] requestedRooms(int price, int persons, String city, String hotel) {
        List<Room> toReturn = new ArrayList<Room>();
        List<Room> foundInApi3 = new ArrayList<Room>();
        API api1 = new BookingComAPI();
        API api2 = new GoogleAPI();
        API api3 = new TripAdviserAPI();
        Collections.addAll(foundInApi3, api3.findRooms(price, persons, city, hotel));
        Collections.addAll(toReturn, check(api1, api2, price, persons, city, hotel));
        toReturn.retainAll(foundInApi3);

        return (Room[]) toReturn.toArray();
    }

    public Room[] check(API api1, API api2, int price, int persons, String city, String hotel) {
        List<Room> foundInApi1 = new ArrayList<Room>();
        List<Room> foundInApi2 = new ArrayList<Room>();
        Collections.addAll(foundInApi1, api1.findRooms(price, persons, city, hotel));
        Collections.addAll(foundInApi2, api2.findRooms(price, persons, city, hotel));
        foundInApi1.retainAll(foundInApi2);

        return (Room[]) foundInApi1.toArray();
    }

    public API[] getApis() {
        return apis;
    }

    public void setApis(API[] apis) {
        this.apis = apis;
    }
}
