public class ConfigManager {
    private String configValue;

    private static ConfigManager instance;

    private ConfigManager(){
        System.out.println("Konfigürasyon Sistemi Aktif Edildi.");
    }

    public static ConfigManager getInstance(){
        if(instance == null){
            instance = new ConfigManager();
        }
        return instance;
    }
    public void SingletonOperation(String value){
        configValue = value;
        System.out.println("Yeni ayar set edildi: " + configValue);
    }
}
