public class Main {
    public static void main(String[] args) {
        Savasci savasci=new Savasci();

        System.out.println("--- Ejderha Yaklaşıyor! ---");
        savasci.setStrategy(new KilicStratejisi());
        savasci.vur();

        System.out.println("\n--- Düşman Havada Uçuyor! ---");
        savasci.setStrategy(new OkStratejisi());
        savasci.vur();


    }
}