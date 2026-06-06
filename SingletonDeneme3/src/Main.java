public class Main {
    public static void main(String[] args) {
        AppCacheManager cache1 = AppCacheManager.getInstance();

        cache1.readCache();
        cache1.writeCache("hi");

        AppCacheManager cache2 = AppCacheManager.getInstance();

        cache2.readCache();

        if (cache1 == cache2) {
            System.out.println("\n[MÜKEMMEL]: cache1 ve cache2 bellekte aynı nesneye bakıyor. Singleton tıkır tıkır çalışıyor!");
        }
    }
}