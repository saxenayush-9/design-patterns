package AbstractFactoryDesignPattern;

public interface Database {

    String getConnectionString();

    DatabaseFactory getDatabaseFactory();

}
