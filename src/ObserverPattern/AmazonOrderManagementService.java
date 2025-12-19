package ObserverPattern;

abstract class AmazonOrderManagementService {
    static void registerServices() {

        EmailService es = EmailService.getInstance();
        es.register();

        NotificationService ns = NotificationService.getInstance();
        ns.register();

        InventoryManagementService ims = InventoryManagementService.getInstance();
        ims.register();
    }

    static void unregisterServices() {

        EmailService es = EmailService.getInstance();
        es.unregister();

    }
}
