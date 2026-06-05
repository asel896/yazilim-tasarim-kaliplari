// KARMAŞIK ALT SİSTEMLER (SUBSYSTEMS)
class FuelPump {
    public void pumpFuel() {
        System.out.println("Yakıt pompası: Yakıt motora gönderildi.");
    }
}
class Battery {
    public void givePower() {
        System.out.println("Akü: Marş motoruna elektrik verildi.");
    }
}

class Engine {
    public void ignite() {
        System.out.println("Motor: Ateşleme yapıldı ve pistonlar çalıştı.");
    }
}

class Lights {
    public void turnOn() {
        System.out.println("Farlar ve Göstergeler: Açıldı.");
    }
}