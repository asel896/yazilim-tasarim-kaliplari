// CLIENT

public class Main {
    public static void main(String[] args) {
        // İlk nesneyi normal yolla (zor yolla) oluşturuyoruz
        ConcretePrototype1 anaNesne = new ConcretePrototype1("Çok Gizli Fabrika Ayarları");

        // new kullanmadan ana nesneyi FOTOKOPİ çekiyoruz
        ConcretePrototype1 kopyaNesne = (ConcretePrototype1) anaNesne.clone();

        
        System.out.print("Orijinal Nesne -> ");
        anaNesne.bilgiVer();

        System.out.print("Klonlanmış Nesne -> ");
        kopyaNesne.bilgiVer();
    }
}