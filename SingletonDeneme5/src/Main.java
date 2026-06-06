public class Main {
    public static void main(String[] args) {
        ConfigManager config1=ConfigManager.getInstance();
        ConfigManager config2=ConfigManager.getInstance();

        config1.updateSetting("2",true);
        config1.printSetting();

        config2.updateSetting("2",true);
        config2.printSetting();

        if(config1==config2){
            System.out.println("config1==config2");
        }
    }
}