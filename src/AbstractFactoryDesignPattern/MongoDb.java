package AbstractFactoryDesignPattern;

public class MongoDb implements Database {

    public String getConnectionString() {
        return "mongodb://srv+username:password/db1";
    }

    public DatabaseFactory getDatabaseFactory() {
        return new MongoDbFactory();
    }
}
