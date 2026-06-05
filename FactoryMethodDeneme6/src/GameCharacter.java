public abstract class GameCharacter {
    public abstract String getJob(); // meslegi ne
    public abstract int getWeaponDamage();  // silah hasari kac

    @Override
    public String toString() {
        return "sinifi: " + this.getJob() + "silah hasari: " + this.getWeaponDamage();
    }
}


class Savasci extends GameCharacter {
    private String job;
    private int damage;

    public Savasci(String job, int damage) {
        this.job = job;
        this.damage = damage;
    }

    @Override
    public String getJob() {
        return this.job;
    }

    @Override
    public int getWeaponDamage(){
        return this.damage;
    }

}

class Buyucu extends GameCharacter {
    private String job;
    private int damage;

    public Buyucu(String job, int damage) {
        this.job = job;
        this.damage = damage;
    }

    @Override
    public String getJob() { return this.job; }

    @Override
    public int getWeaponDamage() { return this.damage; }
}