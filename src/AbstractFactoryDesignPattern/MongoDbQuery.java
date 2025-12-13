package AbstractFactoryDesignPattern;

public class MongoDbQuery implements Query {
    public void execute() {
        System.out.println("Query Executed Successfully");
    }
}
