// 3. ADIM: İSTEMCİ (MAIN)

public class Main {
    public static void main(String[] args) {

        // FACADE OLMASAYDI: Burada 4 tane sınıfı tek tek new'leyip
        // sırayla çağırmak zorunda kalacaktık

        // FACADE İLE: Sadece anahtarı çeviriyoruz
        CarFacade car = new CarFacade();
        car.startCar();
    }
}