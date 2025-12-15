package AdapterPattern;

import AdapterPattern.thirdPartyBankService.HDFCBank;

public class HDFCBankApiAdapter implements BankAdapter {
    private HDFCBank bank;

    public HDFCBankApiAdapter() {
        this.bank = new HDFCBank();
    }

    public double checkBalance(long accountNo) {
        return bank.checkBalance(accountNo);
    }

    public boolean transaction(long receiverAccountNo, double amount) {
        return bank.payment(receiverAccountNo, amount);
    }
}
