public class Main {
    public static void main(String[] args) {

        AbstractFactory fabrika=new SciFiFactory();


        Warrior warrior = fabrika.createWarrior();
        Archer archer = fabrika.createArcher();

        warrior.attack();
        archer.shoot();
    }
}