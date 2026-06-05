// UYGULAMA TARAFI (Kanal Altyapısı)
public interface MesajKanali {
    void kanallaGonder(String icerik);
}

// Somut Kanal 1: E-Posta
class EpostaKanali implements MesajKanali {
    @Override
    public void kanallaGonder(String icerik) {
        System.out.println("[E-Posta Altyapısı] Gönderilen İçerik -> " + icerik);
    }
}

// Somut Kanal 2: SMS
class SmsKanali implements MesajKanali {
    @Override
    public void kanallaGonder(String icerik) {
        System.out.println("[SMS Altyapısı] Gönderilen İçerik -> " + icerik);
    }

}