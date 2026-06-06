public class Main {
    public static void main(String[] args) {
        UretimKazani uretim = new UretimKazani();

        KontrolPaneli kontrolPaneli = new KontrolPaneli();

        GuvenlikSistemi guvenlik = new GuvenlikSistemi();

        uretim.kaydet(kontrolPaneli);
        uretim.kaydet(guvenlik);

        uretim.setSicaklik(20);
    }
    }