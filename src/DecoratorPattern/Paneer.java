package DecoratorPattern;

public class Paneer implements Pizza {
    Pizza p;
    int cost = 60;
    String description = "Paneer";

    Paneer(Pizza p) {
        this.p = p;
    }

    public int getCost() {
        return p.getCost() + cost;
    }

    public String getDescription() {
        return p.getDescription() + description;
    }
}
