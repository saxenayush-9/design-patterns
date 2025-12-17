package DecoratorPattern;

public class Tomato implements Pizza {
    Pizza p;
    int cost = 30;
    String description = "Tomato";

    Tomato(Pizza p) {
        this.p = p;
    }

    public int getCost() {
        return p.getCost() + cost;
    }

    public String getDescription() {
        return p.getDescription() + description;
    }
}
