// interface
public interface Car {
    String getInfo();
    int getSpeed();
}

// concrete interface
class BasicCar implements Car{
    @Override
    public String getInfo() {
        return "Standart Araba";
    }
    @Override
    public int getSpeed() {
        return 120;
    }
}
