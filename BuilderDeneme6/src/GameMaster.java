public class GameMaster {
    private HeroBuilder heroBuilder;

    public GameMaster(HeroBuilder heroBuilder) {
        this.heroBuilder = heroBuilder;
    }

    public void spawnHero(){
        heroBuilder.setHeroClass();
        heroBuilder.setWeapon();
        heroBuilder.setSpecialAbility();
    }
}
