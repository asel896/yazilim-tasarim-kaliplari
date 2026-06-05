public class Main {
    public static void main(String[] args) {
        Navigasyon navigasyon = new Navigasyon();

        System.out.println("Sürücü Modu");
        navigasyon.setStrateji(new ArabaStratejisi());
        navigasyon.rotaHesapla();

        System.out.println("Yaya Modu");
        navigasyon.setStrateji(new YuruyusStratejisi());
        navigasyon.rotaHesapla();
    }
}