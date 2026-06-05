public abstract class Rapor {
    protected Veritabanı db;

    public Rapor(Veritabanı db){
        this.db=db;
    }

    public abstract void raporuGoster();
}

class HaftalikRapor extends Rapor{
    public HaftalikRapor(Veritabanı db) {
        super(db);
    }
    @Override
    public void raporuGoster() {
        db.veriGetir();
        System.out.println("Haftalik rapor ekrana basıldı.");
    }
}

