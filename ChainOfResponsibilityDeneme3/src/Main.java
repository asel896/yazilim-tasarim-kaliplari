public class Main {
    public static void main(String[] args) {
        AtmDispenser ikiyuz=new Dispenser200Tl();
        AtmDispenser yuz =new Dispenser100Tl();
        AtmDispenser elli =new Dispenser50Tl();

        ikiyuz.setNext(yuz);
        yuz.setNext(elli);

        ikiyuz.dispense(200);
        yuz.dispense(200);
        elli.dispense(200);

    }
}