public class Main {
    public static void main(String[] args) {
        // takip edilecek nesneyi oluşturuyoruz
        HisseSenedi appleHisse = new HisseSenedi();

        // takip edecek yatırımcıları (gözlemcileri) oluşturuyoruz
        Yatirimci yatirimci1 = new Yatirimci("Ahmet");
        Yatirimci yatirimci2 = new Yatirimci("Ayşe");

        System.out.println("Yatırımcılar Sisteme Abone Oluyor");

        // yatırımcıları hisse senedinin takip listesine ekliyoruz (attach)
        appleHisse.attach(yatirimci1);
        appleHisse.attach(yatirimci2);

        System.out.println("Fiyat Değişimi");

        // hisse fiyatını değiştiriyoruz fiyat değiştiği an otomatik bildirim gidecek
        appleHisse.setFiyat(150.50);

        System.out.println("Fiyat Değişimi");

        // hisse fiyatı tekrar yükseliyor, yatırımcılar tekrar anlık güncelleniyor
        appleHisse.setFiyat(155.20);

        System.out.println("Ahmet Hisselerini Satıp Abonelikten Çıkıyor");

        // Ahmet'i listeden siliyoruz (detach)
        appleHisse.detach(yatirimci1);

        System.out.println("Fiyat Değişimi");

        // fiyat tekrar değiştiğinde artık sadece listede kalan Ayşe bildirim alacak
        appleHisse.setFiyat(160.00);
    }
}