public class Main {
    public static void main(String[] args) {

    HaberAjansi haberAjansi = new HaberAjansi();

    TvKanali tvKanali = new TvKanali();

    haberAjansi.aboneEkle(tvKanali);

    haberAjansi.yeniHaberGirdi("Observer Kalıbını Ağlatarak Öğrendi!");
    }
}