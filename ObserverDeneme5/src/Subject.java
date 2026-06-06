import java.util.ArrayList;
import java.util.List;

public interface Subject {
    void aboneEkle(Observer o);
    void duyur();
}


class BenzinIstasyonu implements Subject {
    private List<Observer> observes=new ArrayList<>();
    private double benzinFiyati;

    public void setBenzinFiyati(double fiyat){
        this.benzinFiyati = fiyat;
        duyur();
    }
    @Override
    public void aboneEkle(Observer o) {
        observes.add(o);
    }

    @Override
    public void duyur() {
        for (Observer o : observes){
            o.fiyatGuncelle(benzinFiyati);
        }
    }
}


class Tabela implements Observer {
    @Override
    public void fiyatGuncelle(double yeniFiyat) {
        System.out.println("[DEV TABELA] Güncel Benzin Fiyatı: " + yeniFiyat + " TL");
    }
}