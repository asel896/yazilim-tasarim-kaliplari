public class Main {
    public static void main(String[] args) {
        AkilliEvFacade facade = new AkilliEvFacade();
        facade.sinemaModunuAc();
    }
}

/*
public class AkilliEvSistemi {
    public static void main(String[] args) {

        // 1. Alt sistem nesnelerini main içinde (dışarıda) yaratıyoruz (Hocanın slaydındaki gibi)
        Isik salonIsigi = new Isik();
        Klima inverterKlima = new Klima();
        Televizyon oledTv = new Televizyon();

        // 2. Bu nesneleri Facade'ın içine PARAMETRE olarak gönderiyoruz
        AkilliEvFacade akilliEv = new AkilliEvFacade(salonIsigi, inverterKlima, oledTv);

        // 3. Tek metotla sinema modunu tetikliyoruz
        akilliEv.sinemaModunuAc();
    }
}
 */