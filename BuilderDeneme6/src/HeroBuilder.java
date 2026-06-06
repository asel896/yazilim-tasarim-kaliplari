public interface HeroBuilder {
    void setHeroClass();
    void setWeapon();
    void setSpecialAbility();
    Hero createHero();
}

class WarriorBuilder implements HeroBuilder {
    Hero hero = new Hero();

    @Override
    public void setHeroClass() {
        hero.heroClass = "Savaşçı";
    }
    @Override
    public void setWeapon(){
        hero.weapon="Efsanevi Çift El Kılıç";
    }
    @Override
    public void setSpecialAbility(){
        hero.specialAbility="Öfke Patlaması";
    }
    @Override
    public Hero createHero(){
        return hero;
    }
}