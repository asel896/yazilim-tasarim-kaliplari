// fabrika(creator) katmani

// nesne uretim isini alt siniflara devrettigimiz soyut fabrika ve ondan tureyen somut fabrikanin oldugu kisimdir

// soyut fabrika (abstract creator)
public abstract class Logistics {
    // factory method! nesne yaratma isini abstract birakiyoruz
    public abstract Transport createTransport();

    // fabrika sadece nesne uretmekle kalmaz, o nesne ile bir is mantigi da yurutebilir
    public void planDelivery(){
        // nesneyi dogrudan new ile degil, factory method ile cagiriyoruz
        Transport transport = createTransport();
        transport.deliver();
    }
}


// Somut Fabrika 1 (Concrete Creator A)
class RoadLogistics extends Logistics {
    @Override
    public Transport createTransport() {
        return new Truck(); // Tır nesnesi üretip döner
    }
}

// Somut Fabrika 2 (Concrete Creator B)
class SeaLogistics extends Logistics {
    @Override
    public Transport createTransport() {
        return new Ship(); // Gemi nesnesi üretip döner
    }
}