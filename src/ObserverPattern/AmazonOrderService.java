package ObserverPattern;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class AmazonOrderService extends AmazonOrderManagementService {
    private static HashSet<OrderServices> orderServices = new HashSet<>();
    private static AmazonOrderService aos = null;

    private AmazonOrderService() {

    }

    public static AmazonOrderService getInstance() {
        if (aos == null) {
            synchronized (AmazonOrderService.class) {
                if (aos == null) {
                    aos = new AmazonOrderService();
                }
            }
        }
        return aos;
    }

    void registerService(OrderServices o) {
        if (o != null) orderServices.add(o);
    }

    void unregisterService(OrderServices o) {
        orderServices.remove(o);
    }

    public static void orderPlaced() {
        AmazonOrderManagementService.registerServices();
        AmazonOrderManagementService.unregisterServices();
        for (OrderServices orderService : orderServices) {
            orderService.onOrderPlaced();
        }
    }
}
