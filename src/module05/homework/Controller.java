package module05.homework;

import java.util.Arrays;

public class Controller {
    private API[] apis;

    public Controller() {
        apis = new API[]{
                new BookingComAPI(),
                new GoogleAPI(),
                new TripAdvisorAPI()
        };
    }

    public Room[] requestedRooms(int price, int persons, String hotel, String city) {
        Room[] result = new Room[0];
        for (int i = 0; i < apis.length; i++) {
            Room[] rooms = apis[i].findRooms(price, persons, hotel, city);
            int resultLength = result.length;
            int apiRoomsLength = rooms.length;
            result = Arrays.copyOf(rooms, resultLength + apiRoomsLength);
            for (int k = resultLength; k < result.length; k++) {
                result[k] = rooms[k - resultLength];
            }
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
                }
            }
        }
        return result;
    }

    public API[] getApis() {
        return apis;
    }
}
