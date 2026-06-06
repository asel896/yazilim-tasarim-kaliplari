import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public interface Subject {
    void kaydet(Observer o);
    void sil(Observer o);
    void duyur();
}

class UretimKazani implements Subject {
    private List<Observer> observers=new ArrayList<>();
    private int sicaklik;

    public void setSicaklik(int sicaklik){
        this.sicaklik=sicaklik;
        duyur();
    }
    @Override
    public void kaydet(Observer o) {
        observers.add(o);
    }

    @Override
    public void sil(Observer o) {
        observers.remove(o);
    }

    @Override
    public void duyur() {
        for(Observer o:observers){
            duyur();
        }
    }
}


class KontrolPaneli implements Observer {
    @Override
    public void update(int yeniSicaklik) {
        System.out.println("[KONTROL PANELİ] Kazan sıcaklığı güncellendi: " + yeniSicaklik + " derece.");
    }
}

class GuvenlikSistemi implements Observer {
    @Override
    public void update(int yeniSicaklik) {
        System.out.println("[GÜVENLİK SİSTEMİ] Alarm merkezine sıcaklık bilgisi ulaştı: " + yeniSicaklik);

    }
}