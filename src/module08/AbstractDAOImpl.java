package module08;

import java.util.List;

public class AbstractDAOImpl<T> implements AbstractDAO  {
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
    public void saveAll(List list) {

    }

    @Override
    public List getList() {
        return null;
    }

    @Override
    public void deleteById(long id) {

    }

    @Override
    public Object get(long id) {
        return null;
    }
}
