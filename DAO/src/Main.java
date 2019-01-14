
public class Main {
    public static void main(String[] args) {
//        Article article1 = new Article(1, "blabla1", 1);
//        Article article2 = new Article(2, "blabla2", 1);
//        ArticleDao articleDao = new ArticleDao();
//        articleDao.createArticleTable();
//        articleDao.add(article1);
//        articleDao.add(article2);
//
//        User user1 = new User(1, "Joy");
//        User user2 = new User(2, "Troy");
//        UserDao userDao = new UserDao();
//        userDao.createUserTable();
//        userDao.add(user1);
//        userDao.add(user2);


        UserDao userDao = new UserDao();
        User user3 =(User) userDao.getById(2);
        System.out.println(user3.toString());

        ArticleDao articleDao = new ArticleDao();
        System.out.println(articleDao.getAll());
    }
}

// by Александр Осокин и Меженева Ирина
// доделаны delete
// переделан TaskConnection(все еще не работает)