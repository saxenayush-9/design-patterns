package AdapterPattern;

public class Main {
    public static void main(String[] args) {
        PaymentService ps = new PaymentService(new ICICIBankApiAdapter());
        double balance = ps.checkBalance(1351483654);
        boolean transactionStatus = ps.transaction(465385351, 968486.22);
    }
}
