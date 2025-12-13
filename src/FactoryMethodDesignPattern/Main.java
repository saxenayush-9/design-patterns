package FactoryMethodDesignPattern;

public class Main {
    public static void main(String[] args) {
        UserService us = new UserService(new MongoDb());
        us.getUserInfo();
    }
}
