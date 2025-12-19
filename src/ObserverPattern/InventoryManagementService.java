package ObserverPattern;

public class InventoryManagementService implements OrderServices {

    private static InventoryManagementService ims = null;

    private InventoryManagementService() {

    }

    public static InventoryManagementService getInstance() {
        if (ims == null) {
            synchronized (InventoryManagementService.class) {
                if (ims == null) {
                    ims = new InventoryManagementService();
                }
            }
        }
        return ims;
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
        System.out.println("Inventory updated!");
    }
}
