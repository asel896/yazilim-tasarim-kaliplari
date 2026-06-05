// 2. FACADE CEPHE SINIFI

class OrderFacade {
    private InventoryCheck inventory;
    private PaymentGateway payment;
    private ShippingCompany shipping;

    // Constructor
    public OrderFacade() {
        this.inventory = new InventoryCheck();
        this.payment = new PaymentGateway();
        this.shipping = new ShippingCompany();
    }

    // İstemcinin çağıracağı tek metot (void)
    public void orderProduct(String product, double price) {

        System.out.println("=== Sipariş İşlemi Başladı ===");
        inventory.checkStock(product);
        payment.processPayment(price);
        shipping.createShipment(product);
        System.out.println("=== Sipariş Başarıyla Tamamlandı ===");
    }
}
