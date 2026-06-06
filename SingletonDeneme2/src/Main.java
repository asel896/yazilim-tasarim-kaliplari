public class Main {
    public static void main(String[] args) {

        System.out.println("İlk Çağrı Yapılıyor");
        // İlk çağrıda nesne null olduğu için constructor tetiklenecek ve ekrana yazı basacak
        Logger log1=Logger.getInstance();
        log1.log("Kullanıcı giriş yaptı.");

        System.out.println("\n--- İkinci Çağrı Yapılıyor ---");
        // İkinci çağrıda nesne zaten var olduğu için constructor ASLA tetiklenmeyecek!
        Logger log2=Logger.getInstance();
        log2.log("Ödeme işlemi başarıyla tamamlandı.");

        // İki değişken de bellekte aynı nesneyi mi gösteriyor?
        if (log1 == log2) {
            System.out.println("\n[İSPAT BAŞARILI]: log1 ve log2 bellekteki AYNI nesneye işaret ediyor!");
        }
    }
}