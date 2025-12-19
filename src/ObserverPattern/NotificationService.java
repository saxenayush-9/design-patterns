package ObserverPattern;

public class NotificationService implements OrderServices {

    private static NotificationService ns = null;

    private NotificationService() {

    }

    public static NotificationService getInstance() {
        if (ns == null) {
            synchronized (NotificationService.class) {
                if (ns == null) {
                    ns = new NotificationService();
                }
            }
        }
        return ns;
    }

    public void register() {
        AmazonOrderService a = AmazonOrderService.getInstance();
        a.registerService(this);
    }

    public void unregister() {
        AmazonOrderService a = AmazonOrderService.getInstance();
        a.unregisterService(this);
    }

    public void onOrderPlaced() {
        System.out.println("Notification sent!");
    }
}
