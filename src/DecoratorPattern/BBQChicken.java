package DecoratorPattern;

public class BBQChicken implements Pizza {
    int cost = 200;
    String description = "BBQChicken";

    public int getCost() {
        return cost;
    }

    public String getDescription() {
        return description;
    }
}
