public class CurrencyConverter {
    private double usdRate;


    private static CurrencyConverter instance;

    private CurrencyConverter() {
        System.out.println("Döviz Sistemi Aktif Edildi.");
    }
    public static CurrencyConverter getInstance(){
        if(instance==null){
            instance=new CurrencyConverter();
        }
        return instance;
    }

    public void setRate(double rate){
        this.usdRate=rate;
    }

    public void convertToUsd(double tlAmount){
        this.usdRate=tlAmount;
    }
}
