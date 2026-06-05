public class Main {
    public static void main(String[] args) {
        Transport transport;

        Transport ucak = TransportFactory.getTransport("Ucak", 300, 900);
        Transport gemi = TransportFactory.getTransport("Gemi", 5000, 45);

        System.out.println("Üretilen Taşıt 1 -> " + ucak);
        System.out.println("Üretilen Taşıt 2 -> " + gemi);
    }
}