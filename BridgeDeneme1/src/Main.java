// İSTEMCİ

public class Main {
    public static void main(String[] args) {
        
        System.out.println("--- SONY TV VE STANDART KUMANDA ---");
        // Sony TV'yi standart kumandaya bağlıyoruz
        UzaktanKumanda kumanda1 = new StandartKumanda(new SonyTV());
        kumanda1.tusaBasAc();
        kumanda1.tusaBasKapat();

        System.out.println("\n--- SAMSUNG TV VE AKILLI KUMANDA ---");
        // Aynı akıllı kumandayı bu sefer Samsung TV'ye bağlıyoruz
        AkilliKumanda kumanda2 = new AkilliKumanda(new SamsungTV());
        kumanda2.sesleKontrol(); // Akıllı kumandanın özel fonksiyonu çalıştı
    }
}