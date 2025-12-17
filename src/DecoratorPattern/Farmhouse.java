package DecoratorPattern;

public class Farmhouse implements Pizza {
    int cost = 150;
    String description = "Farmhouse";

    public int getCost() {
        return cost;
    }

    public String getDescription() {
        return description;
    }
}
