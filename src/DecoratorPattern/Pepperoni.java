package DecoratorPattern;

public class Pepperoni implements Pizza {
    int cost = 180;
    String description = "Pepperoni";

    public int getCost() {
        return cost;
    }

    public String getDescription() {
        return description;
    }
}
