
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
    }
}
