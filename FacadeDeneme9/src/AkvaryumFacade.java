public class AkvaryumFacade {
    WaterFilter waterFilter;
    AirPump airPump;
    FeedDispenser feedDispenser;

    public AkvaryumFacade(WaterFilter waterFilter, AirPump airPump, FeedDispenser feedDispenser) {
        this.waterFilter = waterFilter;
        this.airPump = airPump;
        this.feedDispenser = feedDispenser;
    }

    public void temizlikModunuAc(){
        waterFilter.filtrele();
        airPump.oksijenVer();
        feedDispenser.yemlemeyiKapat();
    }
}
