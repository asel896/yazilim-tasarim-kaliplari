public class Main {
    public static void main(String[] args) {
        // Önce yayinciyi oluşturuyoruz
        ConcreteSubject youtubeKanali = new ConcreteSubject();

        // Gözlemcileri oluşturup kanala bağlıyoruz
        ConcreteObserver abone1 = new ConcreteObserver("Ahmet", youtubeKanali);
        ConcreteObserver abone2 = new ConcreteObserver("Ayşe", youtubeKanali);

        // Aboneleri yayıncının listesine kaydediyoruz (attach)
        youtubeKanali.attach(abone1);
        youtubeKanali.attach(abone2);

        System.out.println("BİLDİRİM ZAMANI");
        // Kanal durumunu değiştiriyor (Video yüklüyor)
        youtubeKanali.setSubjectState("Tasarım Kalıpları Dersi Yüklendi!");

        System.out.println("BİLDİRİM ZAMANI (Ahmet Abonelikten Çıkıyor)");
        youtubeKanali.detach(abone1); // Ahmet listeden siliniyor

        // Kanal yeni bir durum paylaşıyor
        youtubeKanali.setSubjectState("Observer Kalıbı Soru Çözümü Canlı Yayını!");
    }
}