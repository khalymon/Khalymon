package module07.task4;

import java.util.ArrayList;
import java.util.Arrays;
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

    public Room[] check(API api1, API api2, int price, int persons, String hotel, String city) {
        Room[] result = new Room[0];
        Room[] roomsApi1 = api1.getAll();
        Room[] roomsApi2 = api2.getAll();
        for (int i = 0; i < roomsApi1.length; i++) {
            for (int j = 0; j < roomsApi2.length; j++) {
                if (roomsApi1[i].equals(roomsApi2[j])) {
                    result = Arrays.copyOf(result, result.length + 1);
                    result[result.length - 1] = roomsApi1[i];
                    break;
                }
            }
        }
        return result;
    }

    public API[] getApis() {
        return apis;
    }
}
