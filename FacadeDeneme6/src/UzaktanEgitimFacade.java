// FACADE
class UzaktanEgitimFacade {
    // Kullanacağımız alt sistemlerin referans isimlerini yukarıda tanımlıyoruz
    private Kamera kamera;
    private Mikrofon mikrofon;
    private EkranPaylasimi ekran;

    // CONSTRUCTOR (

    public UzaktanEgitimFacade() {
        this.kamera = new Kamera();
        this.mikrofon = new Mikrofon();
        this.ekran = new EkranPaylasimi();
    }

    // 3. FACADE METODU
    public void dersiBaslat() {

        System.out.println("=== CANLI DERS HAZIRLIKLARI BAŞLADI ===");
        kamera.ac();
        mikrofon.ac();
        ekran.baslat();
        System.out.println("=== DERS BAŞARIYLA BAŞLATILDI. ÖĞRENCİLER BEKLENİYOR ===");
    }
}