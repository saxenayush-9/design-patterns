package AbstractFactoryDesignPattern;

public class MongoDbFactory implements DatabaseFactory {
    public Query getQuery() {
        return new MongoDbQuery();
    }
}
