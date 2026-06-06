public class Main {
    public static void main(String[] args) {

        System.out.println("Birinci Çağrı Yapılıyor");
        // İlk çağrıda nesne null olduğu için constructor tetiklenecek
        DatabaseConnection baglanti1 = DatabaseConnection.getInstance();
        baglanti1.executeQuery("SELECT * FROM Users");

        System.out.println("\n--- İkinci Çağrı Yapılıyor ---");
        // İkinci çağrıda nesne zaten var olduğu için constructor ASLA tetiklenmeyecek
        DatabaseConnection baglanti2 = DatabaseConnection.getInstance();
        baglanti2.executeQuery("UPDATE Products SET price = 100");

        // İspat: İki değişken de bellekte aynı nesneyi mi gösteriyor
        if (baglanti1 == baglanti2) {
            System.out.println("\nİspat Başarılı: İki değişken de bellekteki AYNI nesneye işaret ediyor!");
        }
    }
}