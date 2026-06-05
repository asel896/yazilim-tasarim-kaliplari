public class Main {
    public static void main(String[] args) {

        WaterFilter waterFilter = new WaterFilter();
        AirPump airPump = new AirPump();
        FeedDispenser feedDispenser = new FeedDispenser();

        AkvaryumFacade facade=new AkvaryumFacade(waterFilter, airPump, feedDispenser);
        facade.temizlikModunuAc();
    }

}