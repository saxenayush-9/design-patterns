package FactoryMethodDesignPattern;

public class UserService {
    Database db;

    public UserService(Database db) {
        this.db = db;
    }

    public void getUserInfo() {
        Query q = db.createQuery();
        q.execute();
    }
}
