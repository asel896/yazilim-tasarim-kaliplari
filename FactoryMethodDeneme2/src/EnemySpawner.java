// 3.soyut fabrika(creator)
// neden dogrudan fabrikayi yazmayip soyutunu yaziyoruz?
// cunku ilerleyen asamalarda gece modu veya zor mid gelebilir. soyut fabrika, "dusman uretecek her fabrikanin icinde mutlaka bir createEnemy metodu olmak zorundadir" kuralini koyar
public abstract class EnemySpawner {
    // factory method. ici bos, bunu alt siniflar (somut fabrikalar) dolduracak
    public abstract Enemy createEnemy();

    // fabrika sadece nesne dogurmaz onu hayata da hazirlar
    // nesne dogar dogmaz otomatik saldirsin istiyoruz
    public void spawnAndAttack(){
        Enemy enemy = createEnemy(); // alt sınıftaki fabrikadan nesneyi talep ediyoruz
        enemy.attack(); // dogan düsmani direkt savasa sokuyoruz
    }
}


// 4. somut fabrikalar(concreate creators)
// zombi uretecek ayri, robot uretecek ayridir, o yuzden isler ayrilir

// sadece zombi nesnesi yaratmaktan sorumlu olsun diye
class ZombieSpawner extends EnemySpawner {
    @Override
    public Enemy createEnemy() {
        // new kelimesini projenin geneline sacmak yerine sadece bu hucrenin icine hapsediyoruz
        return new Zombie();
    }
}

// // sadece robot nesnesi yaratmaktan sorumlu olsun diye
class RobotSpawner extends EnemySpawner {
    @Override
    public Enemy createEnemy() {
        return new Robot();
    }
}
