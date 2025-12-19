package ObserverPattern;

public interface OrderServices {
    void onOrderPlaced();

    void register();

    void unregister();
}
