// CALISTIRICI / CLIENT
public class Main {
    public static void main(String[] args) {
        // Elimde sisteme uymayan eski bir kütüphane nesnesi var (Adaptee)
        OldCrypto eskiSistem = new OldCrypto();

        // Bunu yeni sisteme uydurmak için adaptör kılıfına sarıyoruz (ConcreteAdapter)
        CryptoTarget yeniStandart = new CryptoAdapter(eskiSistem);

        // Client sadece yeni standart metodu çağırır, arkada ne döndüğünü bilmez
        yeniStandart.executeEncryption("Gizli Sınav Soruları");
    }
}