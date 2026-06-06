import java.util.ArrayList;
import java.util.List;

public interface Subject {
    void attach(Observer o);
    void detach(Observer o);
    void notifyObservers();
}

class ConcreteSubject implements Subject {
    // tum gozlemcileri listede tutuyoruz
    private List<Observer> observers= new ArrayList<>();
    private String subjectState;  // yayincinin anlik durumu(yeni video basligi gibi)

    public String getSubjectState() {
        return subjectState;
    }

    // durumu degistiginde herkese otomatik haber verilecek
    public void setSubjectState(String newState) {
        this.subjectState = newState;
        System.out.println("Yayıncı Durumu Değişti: " + newState);
        notifyObservers();
    }

    @Override
    public void attach(Observer o) {
        observers.add(o); // listeye abone ekle
    }

    @Override
    public void detach(Observer o) {
        observers.remove(o);  // listeden abone sil
    }

    @Override
    public void notifyObservers() {
        // listedeki tum gozlemcileri teker teker don ve update metodunu tetikle
        for (Observer o : observers) {
            o.update();
        }
    }
}

class ConcreteObserver implements Observer {
    private String observerName;
    private ConcreteSubject subject; // Hangi yayıncıyı takip ettiğinin referansı

    public ConcreteObserver(String observerName, ConcreteSubject subject) {
        this.observerName = observerName;
        this.subject = subject;
    }

    @Override
    public void update() {
        // Yayıncıdan yeni durumu çekip kendi içimizi güncelliyoruz
        String yeniDurum = subject.getSubjectState();
        System.out.println("[" + observerName + "] Bildirimi Aldı! Güncel Veri: " + yeniDurum);
    }
}