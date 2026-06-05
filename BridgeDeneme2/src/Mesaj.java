// SOYUTLAMA TARAFI (Köprünün Kurulduğu Yer)
public abstract class Mesaj {
    protected MesajKanali kanal;

    public Mesaj(MesajKanali kanal) {
        this.kanal = kanal;
    }

    public abstract void gonder(String metin);
}

// GELİŞTİRİLMİŞ SOYUTLAMA (Somut Mesaj Türleri)
class NormalMesaj extends Mesaj {
    public NormalMesaj(MesajKanali kanal) {
        super(kanal); // Kanalı üst sınıftaki köprüye uçuruyoruz
    }

    @Override
    public void gonder(String metin) {
        // İşi doğrudan köprü üzerinden kanala devrediyoruz
        kanal.kanallaGonder(metin);
    }
}

class AcilMesaj extends Mesaj {
    public AcilMesaj(MesajKanali kanal) {
        super(kanal);
    }

    @Override
    public void gonder(String metin) {
        kanal.kanallaGonder("[ACİL DURUM] " + metin);
    }
}