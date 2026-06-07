public class Main {
    public static void main(String[] args) {
        // Önce vagonları bağımsız olarak üretiyoruz
        Handler memur = new DuzMemur();
        Handler kidemli = new KidemliMemur();
        Handler muhendis = new Muhendis();

        // VAGONLARI BİRBİRİNE BAĞLIYORUZ (Tren Kurulumu)
        memur.setHandler(kidemli);   // Memurun arkasına Kıdemliyi bağladık
        kidemli.setHandler(muhendis); // Kıdemlinin arkasına Mühendisi bağladık

        // Zincir : Memur -> Kidemli -> Muhendis

        // İSTEKLERİ EN BAŞTAKİ VAGONA (Memura) FIRLATIYORUZ
        System.out.println("--- 1. İstek Geliyor: Sifre ---");
        memur.handleRequest("Sifre");

        System.out.println("\n--- 2. İstek Geliyor: Cokus ---");
        memur.handleRequest("Cokus");
        // Akış: Memur bakar (çözemez) -> Kıdemliye atar (çözemez) -> Mühendise atar (Mühendis Çözer!)
    }
}