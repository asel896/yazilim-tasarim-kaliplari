public class Main {
    public static void main(String[] args) {
        CurrencyConverter currency1=CurrencyConverter.getInstance();
        currency1.convertToUsd(100);
        currency1.setRate(200);

        CurrencyConverter currency2=CurrencyConverter.getInstance();
        currency1.convertToUsd(100);
        currency1.setRate(200);

        if(currency1==currency2){
            System.out.println("Currency 1 and Currency 2 are equal");
        }
    }
}