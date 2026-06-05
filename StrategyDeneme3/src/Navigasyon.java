public class Navigasyon {
    RotaStratejisi rotaStratejisi;

    public void setStrateji(RotaStratejisi yeniRotaStratejisi) {
        this.rotaStratejisi = yeniRotaStratejisi;
    }

    public void rotaHesapla() {
        rotaStratejisi.rotaCiz();
    }
}
