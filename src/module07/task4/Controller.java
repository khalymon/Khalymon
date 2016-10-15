package module07.task4;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private API[] apis;

    public Controller() {
        apis = new API[]{
                new BookingComAPI(),
                new GoogleAPI(),
                new TripAdvisorAPI()
        };
    }

    public List<Room> requestedRooms(int price, int persons, String hotel, String city) {
        List<Room> result = new ArrayList<Room>();
        for (API api : apis) {
            result.addAll(api.findRooms(price, persons, hotel, city));
        }
        return result;
    }

    public List<Room> check(API api1, API api2, int price, int persons, String hotel, String city) {
        List<Room> result = api1.getAll();
        List<Room> roomsApi2 = api2.getAll();
        result.retainAll(roomsApi2);
        return result;
    }

    public API[] getApis() {
        return apis;
    }
}
