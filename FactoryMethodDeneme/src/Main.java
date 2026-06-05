// istemci(client)

// istemci tarafinda kodun icine asla new Truck() veya new Ship() yazmiyoruz. istemci sadece soyut tiplerle konusur
public class Main {
    public static void main(String[] args) {
       Logistics logistics;

       // senaryo a: kara tasimaciligina kara verildi
        logistics = new RoadLogistics();
        logistics.planDelivery(); // cikti: kargo karayolu ile tirla tasiniyor

        // senaryo b: deniz tasimaciligina karar verildi
        logistics = new SeaLogistics();
        logistics.planDelivery(); // cikti: kargo denizyolu ile gemiyle tasiniyor
    }
}