// adapter
public interface NewPaymentSystem {
    void processPayment(double total);
}

//concrete adapter

class BankAdapter implements NewPaymentSystem {
    private OldBankAPI oldBankApi;

    public BankAdapter(OldBankAPI oldBankApi) {
        this.oldBankApi = oldBankApi;
    }
    @Override
    public void processPayment(double total) {
        oldBankApi.makeOldPayment(total);
    }
}



