public class Main {
    public static void main(String[] args) {
        Odeme odeme=new StandartOdeme(new Akbank());
        odeme.odemeYap(150.0);

        Odeme odeme2=new StandartOdeme(new GarantiBankasi());
        odeme2.odemeYap(250.0);

    }
    }