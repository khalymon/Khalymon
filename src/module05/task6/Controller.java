package module05.task6;

import module05.task1_2.Room;
import module05.task3.API;
import module05.task4.BookingComAPI;
import module05.task4.GoogleAPI;
import module05.task4.TripAdviserAPI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static module05.task7.Main.MyToArray;
import static module05.task7.Main.apisGlobal;

public class Controller {
    private API[] apis = apisGlobal;

    public Room[] requestedRooms(int price, int persons, String hotel, String city) {
        List<Room> toReturn = new ArrayList<Room>();
        List<Room> foundInApi3 = new ArrayList<Room>();
        API api1 = new BookingComAPI();
        API api2 = new GoogleAPI();
        API api3 = new TripAdviserAPI();
        Room[] roomsTmp1 = api1.findRooms(price, persons, hotel, city);
        Room[] roomsTmp2 = api2.findRooms(price, persons, hotel, city);
        Room[] roomsTmp3 = api3.findRooms(price, persons, hotel, city);
        Room[] checkTmp;
        if (roomsTmp1 == null || roomsTmp2 == null || roomsTmp3 == null) {
            return null;
        }
        Collections.addAll(foundInApi3, roomsTmp3);
        checkTmp = check(api1, api2, price, persons, hotel, city);
        if (checkTmp == null) {
            return null;
        }
        Collections.addAll(toReturn, checkTmp);
        toReturn.retainAll(foundInApi3);

        //   return (Room[]) toReturn.toArray();
        return MyToArray(toReturn);
    }

    public Room[] check(API api1, API api2, int price, int persons, String hotel, String city) {
        List<Room> foundInApi1 = new ArrayList<Room>();
        List<Room> foundInApi2 = new ArrayList<Room>();
        Room[] roomsTmp1 = api1.findRooms(price, persons, hotel, city);
        Room[] roomsTmp2 = api2.findRooms(price, persons, hotel, city);

        if (roomsTmp1 == null || roomsTmp2 == null) {
            return null;
        }

        Collections.addAll(foundInApi1, roomsTmp1);
        Collections.addAll(foundInApi2, roomsTmp2);
        foundInApi1.retainAll(foundInApi2);

        //    return (Room[]) foundInApi1.toArray();
        return MyToArray(foundInApi1);
    }

    public API[] getApis() {
        return apis;
    }

    public void setApis(API[] apis) {
        this.apis = apis;
    }
}
