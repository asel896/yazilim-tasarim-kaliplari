public class HeatingSystem {
    private int targetTemperature;

    private static HeatingSystem instance;

    private HeatingSystem() {
        System.out.println("Merkezi Isıtma Sistemi Devreye Girdi.");
    }

    public static HeatingSystem getInstance(){
        if(instance==null){
            instance=new HeatingSystem();
        }
        return instance;
    }

    public void setTemperature(int temp){
        targetTemperature=temp;
    }

    public void showStatus(){
        System.out.println("Temperature: " + targetTemperature);
    }
}
