package AdapterPattern.thirdPartyBankService;

public class ICICIBank {
    long accountNo;
    String IFSCCode;
    String branchName;
    String accountHolder;
    double balance;

    public double seeBalance(long accountNo) {
        return balance;
    }

    public boolean transaction(long receiverAccountNo, double amount) {
        if (balance > amount) {
            this.balance = this.balance - amount;
            return true;
        } else return false;
    }
}
