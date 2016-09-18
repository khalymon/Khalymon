package module05.additional;

public interface DAO {
   public Room save(Room room);

   public boolean delete(Room room);

   public Room update(Room room);

   public Room findById(long id);

   public Room[] getAll();
}
