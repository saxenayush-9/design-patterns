package DecoratorPattern;

public class Margherita implements Pizza {
    int cost = 200;
    String description = "Margherita";

    public int getCost() {
        return cost;
    }

    public String getDescription() {
        return description;
    }
}
