public class Main {
    public static void main(String[] args) {
        // Client doğrudan RealSubject'i bilmez, Proxy üzerinden konuşur
        Subject proxyNesnesi = new Proxy();

        System.out.println("--- İstek Gönderiliyor ---");
        proxyNesnesi.request();
    }
}