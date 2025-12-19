package ObserverPattern;

public class EmailService implements OrderServices {

    private static EmailService es = null;

    private EmailService() {

    }

    public static EmailService getInstance() {
        if (es == null) {
            synchronized (EmailService.class) {
                if (es == null) {
                    es = new EmailService();
                }
            }
        }
        return es;
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
        System.out.println("Email sent!");
    }
}
