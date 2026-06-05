abstract class Transport {
    public abstract int getKapasite();
    public abstract int getHiz();

    public String toString(){
        return "kapasite:" + this.getKapasite() + "hiz:" + this.getHiz();
    }
}


class Ucak extends Transport{
    private int kapasite;
    private int hiz;

    public Ucak(int kapasite, int hiz) {
        this.kapasite=kapasite;
        this.hiz=hiz;
    }

    @Override
    public int getKapasite() {
        return kapasite;
    }

    @Override
    public int getHiz() {
        return hiz;

    }
    @Override
    public String toString() {
        return "kapasite:" + this.getKapasite() + "hiz:" + this.getHiz();
    }
}

class Gemi extends Transport{
    private int kapasite;
    private int hiz;

    public Gemi(int kapasite, int hiz) {
        this.kapasite=kapasite;
        this.hiz=hiz;
    }

    @Override
    public int getKapasite() {
        return kapasite;
    }

    @Override
    public int getHiz() {
        return hiz;

    }
    @Override
    public String toString() {
        return "kapasite:" + this.getKapasite() + "hiz:" + this.getHiz();
    }
}