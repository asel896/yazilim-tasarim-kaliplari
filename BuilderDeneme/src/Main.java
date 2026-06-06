public class Main {
    public static void main(String[] args) {

        // bir ahsap ev ustasi olusturduk (ConcreteBuilder)
        HouseBuilder usta = new WoodHouseBuilder();

        // isin basina muhendis koyup ustayi ona teslim ettik (Director)
        CivilEngineer muhendis = new CivilEngineer(usta);

        // muhendis insaat planini baslatiyor(metotlari sirayla tetikliyor)
        muhendis.construct();

        // insaat bitti ustadan bitmis evi teslim aliyoruz
        House benimEv = usta.getResult();

        // sonuc
        benimEv.showHouse();

    }
}