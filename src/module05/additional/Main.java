package module05.additional;


public class Main {
    public static Room[] rooms = new Room[10];
    static {
        rooms[0] = new Room(435220L, 1000, 1, "Royal", "London");
        rooms[1] = new Room(435221L, 2000, 2, "Royal", "London");
        rooms[2] = new Room(435222L, 2000, 1, "Royal", "Paris");
        rooms[3] = new Room(435223L, 1000, 1, "Intercontinental", "London");
        rooms[4] = new Room(435224L, 2000, 2, "Royal", "London");
        rooms[5] = new Room(435225L, 1000, 1, "Royal", "London");
        rooms[6] = new Room(435226L, 1000, 1, "Intercontinental", "Paris");
        rooms[7] = new Room(435227L, 2000, 1, "Royal", "Paris");
        rooms[8] = new Room(435228L, 3000, 2, "Royal", "London");
        rooms[9] = new Room(435229L, 1000, 1, "Intercontinental", "London");
    }

    public static void printRooms(Room[] rooms) {
        if (rooms != null) {
            for (int i = 0; i < rooms.length; i++) {
                System.out.println(rooms[i].toString());
            }
        } else {
            System.out.println("Rooms DB contains no rooms!");
        }
        System.out.println("==========================================");
    }


    public static void main(String[] args) {
        Controller controller = new Controller();

        printRooms(rooms);

        controller.delete(new Room(435226L, 1000, 1, "Intercontinental", "Paris"));
        printRooms(rooms);

        controller.save(new Room(435333L, 100, 3, "Hostel", "Amsterdam"));
        printRooms(rooms);

        controller.update(new Room(435333L, 900, 3, "Hostel", "Amsterdam"));
        printRooms(rooms);

        System.out.println("=============");
        System.out.println(controller.findById(435221L));
        System.out.println(controller.findById(1L));
        System.out.println("=============");

        printRooms(controller.getAll());

    }
}
