import java.util.ArrayList;
import java.util.List;

public interface Subject {
    void takipciEkle(Observer o);
    void haberVer();
}

class Akvaryum implements Subject{
    private List<Observer> observers=new ArrayList<>();
    private int suSeviyesi;

    public void setSuSeviyesi(int seviye){
        this.suSeviyesi=seviye;
        haberVer();
    }

    @Override
    public void takipciEkle(Observer o) {
        observers.add(o);
    }

    @Override
    public void haberVer() {
        for(Observer o:observers){
            o.suSeviyesiGuncelle(suSeviyesi);
        }
    }
}

class AkilliSuPompasi implements Observer{
    @Override
    public void suSeviyesiGuncelle(int yeniSeviye){
        System.out.println("[AKILLI POMPA] Su seviyesi " + yeniSeviye + " litre olarak algılandı. Sistem stabil.");

    }

}