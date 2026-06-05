// SOYUTLAMA TARAFI (Kumanda Sınıfı - KÖPRÜ )
public abstract class UzaktanKumanda {
    // Kumanda sınıfı, içine "Cihaz" arayüzünü bir değişken olarak alıyor. Böylece hangi cihaz gelirse gelsin onunla konuşabilecek.
    // KOPRU
    protected Cihaz cihaz;

    // Constructor ile hangi cihazı kontrol edeceğimizi köprüye bağlıyoruz
    protected UzaktanKumanda(Cihaz cihaz) {
        this.cihaz = cihaz;
    }

    // Temel kumanda görevleri işi cihaza paslar (Delege eder)
    public void tusaBasAc() {
        cihaz.ac();
    }

    public void tusaBasKapat() {
        cihaz.kapat();
    }

}

// GELİŞTİRİLMİŞ SOYUTLAMA (Somut Kumandalar)

// Normal Kumanda
class StandartKumanda extends UzaktanKumanda {
    public StandartKumanda(Cihaz cihaz) {
        super(cihaz); // Gelen cihazı üst sınıftaki köprüye gönder
    }
}

// Akıllı Kumanda
class AkilliKumanda extends UzaktanKumanda {
    public AkilliKumanda(Cihaz cihaz) {
        super(cihaz);
    }

    // Akıllı kumandaya özel yeni bir yetenek ekliyoruz
    public void sesleKontrol() {
        System.out.print("[Sesli Komut Alındı] -> ");
        cihaz.ac(); // Köprüyü kullanarak cihazı açıyor
    }
}