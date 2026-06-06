public class Main {
    public static void main(String[] args) {
        WarriorBuilder warriorBuilder = new WarriorBuilder();

        GameMaster gameMaster = new GameMaster(warriorBuilder);

        gameMaster.spawnHero();

        Hero hero=warriorBuilder.createHero();

        hero.printHero();
    }
}