package module05.additional;

import static module05.additional.Main.rooms;

public class Controller implements DAO {
    public Room[] getAll() {
        return rooms;
    }

    public Room save(Room room) {
        int oldSize = rooms.length;
        Room[] tmp = new Room[oldSize + 1];
        for (int i = 0; i < oldSize; i++) {
            tmp[i] = rooms[i];
        }
        tmp[oldSize] = room;
        rooms = tmp;
        return room;
    }

    public Room findById(long id) {
        Room tmp = null;
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i].getId() == id) {
                tmp = rooms[i];
                break;
            }
        }
        return tmp;
    }

    public boolean delete(Room room) {
        int oldSize = rooms.length;

        if (findById(room.getId()) == null) {
            return false;
        }

        Room[] tmp = new Room[oldSize - 1];
        int indexDel = -1;
        for (int i = 0; i < oldSize; i++) {
            if (rooms[i].getId() == room.getId()) {
                indexDel = i;
                break;
            }
        }
        for (int i = 0; i < indexDel; i++) {
            tmp[i] = rooms[i];
        }
        for (int i = indexDel + 1; i < oldSize; i++) {
            tmp[i - 1] = rooms[i];
        }
        rooms = tmp;

        return true;
    }

    public Room update(Room room) {
        Room tmp = findById(room.getId());
        if (tmp == null) {
            return tmp;
        }
        int indexUpd = -1;
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i].getId() == room.getId()) {
                indexUpd = i;
                break;
            }
        }
        rooms[indexUpd] = room;
        return room;
    }
}
