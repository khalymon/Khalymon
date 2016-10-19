package module08;

import java.util.ArrayList;
import java.util.List;

public class AbstractDAOImpl<T> implements AbstractDAO<T> {
    @Override
    public T save(T t) {
        System.out.println(t.getClass().getSimpleName() + " " + t.toString() + " has been saved.");
        return t;
    }

    @Override
    public void delete(T t) {
        System.out.println(t.getClass().getSimpleName() + " " + t.toString() + " has been deleted.");
    }

    @Override
    public void saveAll(List<T> tList) {
        System.out.println(tList.getClass().getSimpleName() + " " + tList.toString() + " has been deleted.");
    }

    @Override
    public List<T> getList() {
        List<T> tList = new ArrayList<T>();
        return tList;
    }

    @Override
    public void deleteById(long id) {
        System.out.println("Item with id=" + id + " has been deleted.");
    }

    @Override
    public T get(long id) {
        List<T> tList = new ArrayList<T>();
        for (T t : tList) {
            if (t.hashCode() == id) {
                return t;
            }
        }
        return null;
    }

}
