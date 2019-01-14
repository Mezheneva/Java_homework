public class Article {
    private int id;
    private String title;
    private int idUser;

    public Article() {
    }

    public Article(int id, String title, int idUser) {
        this.id = id;
        this.title = title;
        this.idUser = idUser;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }
}
