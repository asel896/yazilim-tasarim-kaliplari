public class Main {
    public static void main(String[] args) {
        CardFactory factory;

        // Müşteri Ziraat kartını takarsa:
        factory = new ZiraatFactory(); // Ziraat matbaasını çalıştırıyoruz
        factory.executePayment();
        // Çıktı: Ziraat Kart ile borç ödeme işlemi tamamlandı.

        // Müşteri Vakıfbank kartını takarsa:
        factory = new VakifbankFactory(); // Vakıfbank matbaasını çalıştırıyoruz
        factory.executePayment();
        // Çıktı: Vakıfbank Kart ile borç ödeme işlemi tamamlandı.
    }
}