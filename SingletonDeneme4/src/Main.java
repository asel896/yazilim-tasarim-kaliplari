public class Main {
    public static void main(String[] args) {
        ConfigManager config1=ConfigManager.getInstance();
        config1.SingletonOperation("10");
        ConfigManager config2=ConfigManager.getInstance();
        config2.SingletonOperation("20");

        if(config1==config2){
            System.out.println("config1==config2");
        }
    }
}