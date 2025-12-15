package AdapterPattern;

import AdapterPattern.thirdPartyBankService.ICICIBank;

public class ICICIBankApiAdapter implements BankAdapter {
    private ICICIBank bank;

    public ICICIBankApiAdapter() {
        this.bank = new ICICIBank();
    }

    public double checkBalance(long accountNo) {
        return bank.seeBalance(accountNo);
    }

    public boolean transaction(long receiverAccountNo, double amount) {
        return bank.transaction(receiverAccountNo, amount);
    }
}
