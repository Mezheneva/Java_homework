import java.sql.SQLException;
import java.util.List;

public interface Dao {
    void add(Object o);
    void delete(Object o);
    void update(Object o);
    List<?> getAll();
    Object getById(int id) throws SQLException;
}
