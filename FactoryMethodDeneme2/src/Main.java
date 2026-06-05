<<<<<<< HEAD
// oyun motorunu calistiralim
public class Main {
    public static void main(String[] args) {
        EnemySpawner spawner;

        // Bölüm 1: Zombi istilası başladı
        spawner = new ZombieSpawner();
        spawner.spawnAndAttack(); // Çıktı: Zombi yaklaştı ve ısırdı! -20 HP

        // Bölüm 2: Gelecekten robotlar geldi
        spawner = new RobotSpawner();
        spawner.spawnAndAttack(); // Çıktı: Robot lazer fırlattı! -40 HP
=======
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
>>>>>>> 5c13075986a796efa2013378eb6d2e992660edf6
    }
}