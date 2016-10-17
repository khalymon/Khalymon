package module08;

import java.util.List;

public interface AbstractDAO<T> {

    T save(T t);

    void delete(T t);

    void saveAll(List<T> tList);

    List<T> getList();

}
