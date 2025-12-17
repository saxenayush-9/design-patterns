package DecoratorPattern;

public class Cheese implements Pizza {
    Pizza p;
    int cost = 80;
    String description = "Cheese";

    Cheese(Pizza p) {
        this.p = p;
    }

    public int getCost() {
        return p.getCost() + cost;
    }

    public String getDescription() {
        return p.getDescription() + description;
    }
}
