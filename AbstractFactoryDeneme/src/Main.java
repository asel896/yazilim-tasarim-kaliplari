public class Main {
    public static void main(String[] args) {
        // once kullanacağımız somut fabrikayı seçiyoruz (Polimorfizm)
        AbstractFactory fabrika = new ConcreteFactory();

        // Fabrikaya "Bana ürün üret" diyoruz, arkada ne döndüğünü Client bilmiyor
        AbstractProduct urunA = fabrika.createProductA();

        // 3. Ürünü kullanıyoruz
        urunA.display();
    }
}