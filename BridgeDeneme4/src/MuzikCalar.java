public abstract class MuzikCalar {
    protected Hoparlor hoparlor;

    public MuzikCalar(Hoparlor hoparlor) {
        this.hoparlor = hoparlor;
    }

    public abstract void muzikCal();
}

class Radyo extends MuzikCalar {
    public Radyo(Hoparlor hoparlor) {
        super(hoparlor);
    }

    @Override
    public void muzikCal() {
        hoparlor.sesVer();
        System.out.println("Radyo yayını başladı.");
    }
}

