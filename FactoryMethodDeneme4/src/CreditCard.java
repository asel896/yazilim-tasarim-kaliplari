// Hangi bankanın kartı olursa olsun, o kartın ortak bir işi vardır: Ödeme yapmak.
// 1. soyut urun
interface CreditCard {
    void pay();
}

// yukaridaki kurala uyan gercek kartlari basiyoruz
// 2. somut urun
// Ziraat Bankası'nın kendine has ödeme mantığını çalıştırmak için.
class ZiraatKart implements CreditCard {
    @Override
    public void pay() {
        System.out.println("ZiraatKart");
    }
}

// Vakıfbank'ın kendine has ödeme mantığını çalıştırmak için.
class VakifbankKart implements CreditCard {
    @Override
    public void pay() {
        System.out.println("VakifBank");
    }
}