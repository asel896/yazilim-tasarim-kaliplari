public interface Warrior {
    void attack();
}

interface Archer{
    void shoot();
}

class MedievalWarrior implements Warrior{
    @Override
    public void attack(){
        System.out.println("MedievalWarrior");
    }
}

class SciFiWarrior implements Warrior{
    @Override
    public void attack(){
        System.out.println("SciFiWarrior");
    }
}

class MedievalArcher implements Archer{
    @Override
    public void shoot(){
        System.out.println("MedievalArcher");
    }
}

class SciFiArcher implements Archer{
    @Override
    public void shoot(){
        System.out.println("SciFiArcher");
    }
}