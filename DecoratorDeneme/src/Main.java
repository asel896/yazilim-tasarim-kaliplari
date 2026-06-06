public class Main {
    public static void main(String[] args) {
        // Çıplak nesne üretilir
        Component nesne = new ConcreteComponent();

        // Nesne süsleyicinin içine atılarak dinamik olarak genişletilir
        Component susluNesne = new ConcreteDecorator(nesne);

        // Metot çağrıldığında zincirleme olarak içiçe çalışır
        susluNesne.operation();
        // Çıktı: Yalın Nesne + Eklenmiş Özellik (Süslendi)
    }
}