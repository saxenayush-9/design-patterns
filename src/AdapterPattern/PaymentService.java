package AdapterPattern;

public class PaymentService {
    private BankAdapter b;

    PaymentService(BankAdapter b) {
        this.b = b;
    }

    public double checkBalance(long accountNo) {
        return b.checkBalance(accountNo);
    }


    public boolean transaction(long receiverAccountNo, double amount) {
        return b.transaction(receiverAccountNo, amount);
    }

}
