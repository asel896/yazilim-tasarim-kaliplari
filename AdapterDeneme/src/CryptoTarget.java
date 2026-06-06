// STANDART ARAYUZ / ADAPTER

interface CryptoTarget {
    void executeEncryption(String data);
}


// SOMUT ADAPTOR / CONCRETEADAPTER

class CryptoAdapter implements CryptoTarget {
    // Uyumsuz nesneyi içeride referans olarak tutar
    private OldCrypto oldCrypto;

    // Constructor ile uyumsuz sistemi içeri alıyoruz
    public CryptoAdapter(OldCrypto oldCrypto) {
        this.oldCrypto = oldCrypto;
    }


    @Override
    public void executeEncryption(String data) {
        System.out.println("Adaptör araya girdi, veriyi eski sisteme gönderiyor...");
        // Standart metot çağrıldığında arka planda uyumsuz metodu tetikliyoruz
        oldCrypto.encryptTheText(data);
    }
}