public class AppSettings {
    private static AppSettings instance;

    public String theme = "Dark Mode";

    private AppSettings() {

    }
    public static AppSettings getInstance(){
        if(instance == null){
            instance = new AppSettings();
        }
        return instance;
    }

}
