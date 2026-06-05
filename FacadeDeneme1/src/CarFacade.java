// FACADE CEGHE SINIFI (KURTARICI)

class CarFacade {
    // Arkadaki çırak sınıfları içine alıyor (Composition)
    private FuelPump fuelPump;
    private Battery battery;
    private Engine engine;
    private Lights lights;

    // Constructor içinde bu nesneleri hazırlıyoruz
    public CarFacade() {
        this.fuelPump = new FuelPump();
        this.battery = new Battery();
        this.engine = new Engine();
        this.lights = new Lights();
    }

    // loose coupling: arabaya yeni bir sistem eklenirse main metodundaki koda dokunmadan sadece startCar metodunun arasina bir satir ekleriz
    // İstemciye sunulan tek buton
    public void startCar() {
        System.out.println("--- ARABA ÇALIŞTIRMA SÜRECİ BAŞLADI ---");
        battery.givePower();
        fuelPump.pumpFuel();
        engine.ignite();
        lights.turnOn();
        System.out.println("--- ARABA KULLANIMA HAZIR ---");
    }
}