public class Main {
    public static void main(String[] args) {
        HeatingSystem sistem1=HeatingSystem.getInstance();
        HeatingSystem sistem2=HeatingSystem.getInstance();

        sistem1.setTemperature(35);
        sistem1.showStatus();

        sistem2.setTemperature(35);
        sistem2.showStatus();

        if(sistem1==sistem2){
            System.out.println("sistem1 ve sistem2 esit");
        }
    }
}