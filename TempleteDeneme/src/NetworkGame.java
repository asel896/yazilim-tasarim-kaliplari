// abstract class
public abstract class NetworkGame {

    // algoritmanin iskeleti, adimlari sirayla cagirir, alt siniflar bu sirayi degistirmez
    public final void play() {
        startVideo();
        loadAssets();      // Değişken adım
        initializePlayers(); // Değişken adım
        endVideo();
    }

    // ortak adimlar
    private void startVideo() {
        System.out.println("Oyun introsu oynatılıyor...");
    }

    private void endVideo() {
        System.out.println("Oyun bitti, skor tablosu gösteriliyor.");
    }

    // alt siniflarin doldurmasi gereken bos adimlar
    protected abstract void loadAssets();
    protected abstract void initializePlayers();
}


class MarioGame extends NetworkGame {
    @Override
    protected void loadAssets() {
        System.out.println("Mario dünyası görselleri ve sesleri yükleniyor...");
    }
    @Override
    protected void initializePlayers() {
        System.out.println("Mario ve Luigi karakterleri haritaya yerleştirildi.");
    }
}


class ChessGame extends NetworkGame {
    @Override
    protected void loadAssets() {
        System.out.println("Satranç tahtası ve taş tasarımları yükleniyor...");
    }

    @Override
    protected void initializePlayers() {
        System.out.println("Beyaz ve Siyah oyuncuların taşları dizildi.");
    }
}




