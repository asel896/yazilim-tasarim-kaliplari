public abstract class Odeme {
    protected BankaAltyapisi banka;

    public Odeme(BankaAltyapisi banka) {
        this.banka = banka;
    }

    public abstract void odemeYap(double tutar);
}

class StandartOdeme extends Odeme {
    public StandartOdeme(BankaAltyapisi banka) {
        super(banka);
    }

    @Override
    public void odemeYap(double tutar) {
        banka.bankadanCek(tutar);
    }
}

