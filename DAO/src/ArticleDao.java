
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ArticleDao implements Dao {

    TaskConnection connection = new TaskConnection();

    protected void createArticleTable(){
        String sql = "CREATE TABLE IF NOT EXISTS Article (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL," +
                "title TEXT NOT NULL," + "idUser INTEGER NOT NULL);";
        try {
            connection.createTable(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void add(Object object) {
        try {
            Article article = (Article) object;
//            String s = "Insert into Article (idUser) Values (1)";
            connection.updateTable("INSERT INTO Article (id, title, idUser) VALUES ("+article.getId() + ", '" + article.getTitle() + "', "+ article.getIdUser() + ");");
//          connection.updateTable(s);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(Object o) {
        Article article = (Article) o;
        try {
            connection.updateTable("DELETE FROM User WHERE id=" + article.getId() + ";");
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(Object o) {
        Article article = (Article) o;
        try {
            connection.updateTable("UPDATE User SET title='"+article.getTitle()+"', idUser=" + article.getIdUser() +"  WHERE id=" + article.getId() + ";");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Article> getAll()
    {
        String querry = "SELECT * FROM Article;";
        List<Article> list = new ArrayList<>();
        try (PreparedStatement stm = connection.querryTable(querry)){

            ResultSet resultSet = stm.executeQuery();

            while(resultSet.next()){
                Article article = new Article();
                article.setId(resultSet.getInt("id"));
                article.setTitle(resultSet.getString("title"));
                article.setIdUser(resultSet.getInt("idUser"));
                list.add(article);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }

    @Override
    public Object getById(int id) throws SQLException {
        String querry = "SELECT * FROM Article WHERE id=" + id + ";";
        Article article = new Article();

        try (PreparedStatement stm = connection.querryTable(querry)){

                ResultSet resultSet = stm.executeQuery();

            resultSet.next();
            article.setId(resultSet.getInt("id"));
            article.setTitle(resultSet.getString("title"));
            article.setIdUser(resultSet.getInt("idUser"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return article;
    }
}