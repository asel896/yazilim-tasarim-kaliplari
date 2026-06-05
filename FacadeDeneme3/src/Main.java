// İSTEMCİ
public class Main {
    public static void main(String[] args) {
        // Facade nesnesini oluşturup siparişi veriyoruz
        OrderFacade orderFacade = new OrderFacade();
        orderFacade.orderProduct("PlayStation 5", 25000.0);
    }
}