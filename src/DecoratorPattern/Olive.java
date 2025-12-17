package DecoratorPattern;

public class Olive implements Pizza {
    Pizza p;
    int cost = 20;
    String description = "Olive";

    Olive(Pizza p) {
        this.p = p;
    }

    public int getCost() {
        return p.getCost() + cost;
    }

    public String getDescription() {
        return p.getDescription() + description;
    }
}
