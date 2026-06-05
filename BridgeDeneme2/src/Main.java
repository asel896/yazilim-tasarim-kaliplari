// İSTEMCİ (Köprüleri Bağlama)

public class Main {
    public static void main(String[] args) {
        System.out.println("--- SENARYO 1: E-posta ile Normal Mesaj ---");
        // Normal mesajı E-posta kanalına bağlıyoruz
        Mesaj epostaMesaji = new NormalMesaj(new EpostaKanali());
        epostaMesaji.gonder("Toplantı saat 10:00'da başlayacaktır.");

        System.out.println("\n--- SENARYO 2: SMS ile Acil Mesaj ---");
        // Acil mesajı SMS kanalına bağlıyoruz
        Mesaj smsMesaji = new AcilMesaj(new SmsKanali());
        smsMesaji.gonder("Sunucu çöktü, acil müdahale gerekiyor!");
    }
}