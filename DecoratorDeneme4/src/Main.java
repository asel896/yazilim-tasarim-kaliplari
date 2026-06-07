public class Main {
    public static void main(String[] args) {
        Car yarışArabası = new BasicCar();

        yarışArabası = new RimsDecorator(yarışArabası);

        yarışArabası = new NitroDecorator(yarışArabası);

        System.out.println("Araba Detayları: " + yarışArabası.getInfo());
        System.out.println("Maksimum Hız: " + yarışArabası.getSpeed() + " km/h");
    }
}