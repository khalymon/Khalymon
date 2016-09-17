package module05.task5;

import module05.task1_2.Room;

public interface DAO {
    Room save(Room room);

    boolean delete(Room room);

    Room update(Room room);

    Room findById(long id);
}
