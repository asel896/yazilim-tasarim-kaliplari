public class Main {
    public static void main(String[] args) {
        OldBankAPI api = new OldBankAPI();

        BankAdapter bankAdapter = new BankAdapter(api);

        bankAdapter.processPayment(500);
    }
}