public class AppCacheManager {
    private static AppCacheManager instance;

    private String cachedData = "Boş";
    private AppCacheManager() {
        System.out.println("Önbellek Yöneticisi başlatıldı.");
    }

    public static AppCacheManager getInstance() {
        if (instance == null) {
            instance = new AppCacheManager();
        }
        return instance;
    }
    public void writeCache(String data){
        cachedData=data;
        System.out.println("Önbelleğe yazıldı: " + data);
    }
    public void readCache(){
        System.out.println("Önbellekten okunan veri: " + cachedData);
    }
}
