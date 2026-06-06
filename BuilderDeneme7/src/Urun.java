public class Urun {
    private String icerik;

    public void setIcerik(String icerik) {
        this.icerik = icerik;
    }

    public void belgeyiGoster() {
        System.out.println("Belge Çıktısı:\n" + icerik);
    }
}