public interface CanavarPrototype {
    CanavarPrototype clone();
}

class Zombie implements CanavarPrototype {
    private int can;
    private String tur;

    public Zombie(int can, String tur) {
        this.can = can;
        this.tur = tur;
    }

    @Override
    public CanavarPrototype clone() {
        return new Zombie(this.can, this.tur);
    }

    public void canavarBilgisi() {
        System.out.println("Tür: " + tur + ", Can: " + can);
    }
}

class Archer implements CanavarPrototype {
    private int can;
    private String tur;

    public Archer(int can, String tur) {
        this.can = can;
        this.tur = tur;
    }

    @Override
    public CanavarPrototype clone() {
        return new Archer(this.can, this.tur);
    }

    public void canavarBilgisi() {
        System.out.println("Tür: " + tur + " | Can: " + can);

    }
}