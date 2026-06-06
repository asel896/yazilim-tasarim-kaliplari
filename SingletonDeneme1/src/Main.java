public class Main {
    public static void main(String[] args) {
        // Ayarlar yöneticisine ilk erişim
        AppSettings ayar1 = AppSettings.getInstance();
        System.out.println("İlk Nesne Teması: " + ayar1.theme); // Çıktı: Dark Mode

        // İlk nesne üzerinden temayı değiştirelim
        ayar1.theme = "Light Mode";
        System.out.println("Tema 'Light Mode' olarak güncellendi.");

        // İkinci bir değişken üzerinden tekrar getInstance() çağıralım
        AppSettings ayar2 = AppSettings.getInstance();

        // İkinci nesne üzerinden temayı okuyoruz
        // Eğer Singleton düzgün çalıştıysa, yeni bir nesne oluşmadığı için burası da "Light Mode" olmalı!
        System.out.println("İkinci Nesne Teması: " + ayar2.theme); // Çıktı: Light Mode

        if (ayar1 == ayar2) {
            System.out.println("\nSonuç: Bellekteki tek bir nesne iki değişken tarafından da paylaşıldı!");
        }
    }
}