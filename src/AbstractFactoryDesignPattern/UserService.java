package AbstractFactoryDesignPattern;

public class UserService {
    Database db;

    UserService(Database b) {
        this.db = b;
    }

    public void getUserInfo() {
        Query q = db.getDatabaseFactory().getQuery();
        q.execute();
    }
}
