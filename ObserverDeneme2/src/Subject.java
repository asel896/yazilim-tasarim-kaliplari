import java.util.ArrayList;
import java.util.List;

public interface Subject {
    void ekle(Observer o);
    void sil(Observer o);
    void haberVer();
}


class HavaDurumuIstasyonu implements Subject {
    private List<Observer> observers=new ArrayList<>();
    private int sicaklik;

    void setSicaklik(int yeniSicaklik){
        this.sicaklik = yeniSicaklik;
        haberVer();
    }

    @Override
    public void ekle(Observer o) {
        observers.add(o);
    }
    @Override
    public void sil(Observer o) {
        observers.remove(o);
    }
    @Override
    public void haberVer() {
        for (Observer o : observers) {
            o.guncelle(sicaklik);
        }
    }
}

class Klima implements Observer {
    private int sicaklik;

    @Override
    public void guncelle(int sicaklik) {
        System.out.println("Klima algıladı! Oda sıcaklığı " + sicaklik + " derece. Mod ayarlanıyor.");
    }
}