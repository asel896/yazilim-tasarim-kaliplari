public class Main {
    public static void main(String[] args) {
        // Çıplak bilgisayarı üretiyoruz (Fiyat: 10000)
        Computer bilgisayar = new BasicComputer();

        // Bilgisayarı RAM ile sarmalıyoruz (Fiyat: 10000 + 2000 = 12000)
        bilgisayar = new RamDecorator(bilgisayar);

        // Aynı bilgisayarı bir de Ekran Kartı ile sarmalıyoruz (Matruşka Zinciri)
        // (Fiyat: 12000 + 5000 = 17000)
        bilgisayar = new GpuDecorator(bilgisayar);

        
        System.out.println("Özellikler: " + bilgisayar.getDescription());
        System.out.println("Toplam Fiyat: " + bilgisayar.getPrice() + " TL");
    }
}