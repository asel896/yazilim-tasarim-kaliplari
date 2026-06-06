import java.util.ArrayList;
import java.util.List;

public interface Subject {
    void attach(Observer o);
    void detach(Observer o);
    void notifyObservers();
}


class HisseSenedi implements Subject {
    private List<Observer> observers=new ArrayList<>();
    private double fiyat;

    void setFiyat(double yeniFiyat) {
        this.fiyat = yeniFiyat;
        notifyObservers();
    }
    @Override
    public void attach(Observer o) {
        observers.add(o);
    }

    @Override
    public void detach(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(fiyat); // Gözlemcilere güncel fiyatı uçuruyoruz
        }
    }


}


class Yatirimci implements Observer {
    private String isim;

    public Yatirimci(String isim) {
        this.isim=isim;
    }

    @Override
    public void update(double yeniFiyat) {
        System.out.println("[Yatırımcı " + isim + "] Hisse Fiyatı Güncellendi: $" + yeniFiyat);
    }

}