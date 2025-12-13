package FactoryMethodDesignPattern;

public class MongoDbQuery implements Query {
    public void execute() {
        System.out.println("Query Executed");
    }
}
