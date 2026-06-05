public interface Cihaz {
    void ac();
    void kapat();
}

// Somut Cihaz 1: Sony TV
class SonyTV implements Cihaz {
    @Override
    public void ac() {
        System.out.println("Sony TV açıldı.");
    }

    @Override
    public void kapat() {
        System.out.println("Sony TV kapatıldı.");
    }
}

// Somut Cihaz 2: Samsung TV
class SamsungTV implements Cihaz {
    @Override
    public void ac() {
        System.out.println("Samsung TV açıldı.");
    }
    @Override
    public void kapat() {
        System.out.println("Samsung TV kapatıldı.");
    }
}
