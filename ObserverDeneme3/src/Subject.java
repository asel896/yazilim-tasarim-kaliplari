import java.util.ArrayList;
import java.util.List;

public interface Subject {
    void aboneEkle(Observer o);
    void aboneSil(Observer o);
    void tumuneDuyur();

}


class HaberAjansi implements Subject {
    private List<Observer> observers=new ArrayList<>();
    private String sonDakikaHaber;

    public void yeniHaberGirdi(String haber){
        this.sonDakikaHaber = haber; // Önce gelen haberi hafızaya alıyoruz
        tumuneDuyur();
    }

    @Override
    public void aboneEkle(Observer o) {
        observers.add(o);
    }

    @Override
    public void aboneSil(Observer o) {
        observers.remove(o);
    }

    @Override
    public void tumuneDuyur() {
        for (Observer o : observers) {
            o.haberAl(sonDakikaHaber);
        }
    }
}

class TvKanali implements Observer {
    @Override
    public void haberAl(String haberBasligi){
        System.out.println("[TV KANALI] Flaş Gelişme Ekranda Altyazı Geçiyor: " + haberBasligi);
    }


}