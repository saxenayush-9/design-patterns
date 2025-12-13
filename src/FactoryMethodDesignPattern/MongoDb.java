package FactoryMethodDesignPattern;

public class MongoDb implements Database {
    public Query createQuery() {
        return new MongoDbQuery();
    }
}
