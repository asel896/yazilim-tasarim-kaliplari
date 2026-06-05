public class Main {
    public static void main(String[] args) {
        AlisverisSepeti alisverisSepeti = new AlisverisSepeti();

        System.out.println("Kredi Kartı Seçildi");
        alisverisSepeti.setStrateji(new KrediKartiStratejisi());
        alisverisSepeti.odemeYap(500.0);

        System.out.println("Müşteri Vazgeçti, PayPal Seçti");
        alisverisSepeti.setStrateji(new PaypalStratejisi());
        alisverisSepeti.odemeYap(500.0);
    }
}