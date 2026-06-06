public class ConfigManager {
    private boolean isSecure;
    private String configKey;

    private static ConfigManager instance;

    private ConfigManager() {
        System.out.println("ConfigManager created");
    }

    public static ConfigManager getInstance() {
        if(instance==null){
            instance = new ConfigManager();
        }
        return instance;
    }

    public void updateSetting(String key, boolean secure){
        configKey = key;
        isSecure = secure;
    }

    public void printSetting(){
        System.out.println(configKey + ": " + isSecure);
    }
}
