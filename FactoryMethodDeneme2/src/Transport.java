// urun (product) katmani
// uretilecek nesnelerin tasiyacagi ortasiyacagi ortak sozlesmeyi bir interface ile tanimliyoruz

// soyut urun (arayuz)
interface Transport {
    void deliver();
}

// somut urun 1 (concreate product a)
class Truck implements Transport {
    @Override
    public void deliver(){
        System.out.println("Kargo karayolu ile tırla taşınıyor.");
    }
}

// somut urun 2 (concreate product 2)
class Ship implements Transport {
    @Override
    public void deliver(){
        System.out.println("Kargo denizyolu ile gemiyle taşınıyor.");
    }
}