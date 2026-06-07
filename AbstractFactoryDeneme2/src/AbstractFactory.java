public interface AbstractFactory {
    Warrior createWarrior();
    Archer createArcher();
}

class MedievalFactory implements AbstractFactory{
    @Override
    public Warrior createWarrior(){
        return new MedievalWarrior();
    }
    @Override
    public Archer createArcher(){
        return new MedievalArcher();
    }
}

class SciFiFactory implements AbstractFactory {
    @Override
    public Warrior createWarrior() {
        return new SciFiWarrior();
    }

    @Override
    public Archer createArcher() {
        return new SciFiArcher();
    }
}