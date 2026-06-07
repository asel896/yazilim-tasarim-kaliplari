public interface Subject {
    void request();
}

class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("RealSubject: Ağır ve maliyetli asıl iş yapılıyor...");
    }
}

class Proxy implements Subject {
    private RealSubject realSubject;

    @Override
    public void request() {
        // ihtiyac aninda gercek nesneyi olusturuyoruz
        if (realSubject == null) {
            System.out.println("Proxy: Gerçek nesne henüz yok, şimdi oluşturuluyor...");
            realSubject = new RealSubject();
        }
        System.out.println("Proxy: İstek kontrol edildi, asıl nesneye yönlendiriliyor.");
        realSubject.request(); // Gerçek nesne tetikleniyor
    }
}
