package AdapterPattern.thirdPartyBankService;

public class HDFCBank {
    long accountNo;
    String IFSCCode;
    String branchName;
    String accountHolder;
    double balance;

    public double checkBalance(long accountNo) {
        return balance;
    }

    public boolean payment(long receiverAccountNo, double amount) {
        if (balance > amount) {
            this.balance = this.balance - amount;
            return true;
        } else return false;
    }
}
