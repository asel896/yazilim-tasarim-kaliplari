public class Yonetici {
    private Builder builder;

    public Yonetici(Builder builder) {
        this.builder = builder;
    }

    public void belgeyiDonustur(String metin) {
        builder.olustur(metin);
    }
}