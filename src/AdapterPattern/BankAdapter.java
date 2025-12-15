package AdapterPattern;

public interface BankAdapter {
    double checkBalance(long accountNo);

    boolean transaction(long receiverAccountNo, double amount);
}
