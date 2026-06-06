public interface CarBuilder {
    void buildChassis();
    void buildEngine();
    void buildWheels();
    Car getVehicle();
}

class SportsCarBuilder implements CarBuilder {

    Car car = new Car();

    @Override
    public void buildChassis() {
        car.chassis="Karbon Fiber Şasi";
    }
    @Override
    public void buildEngine() {
        car.engine="V8 Turbo Motor";
    }
    @Override
    public void buildWheels() {
        car.wheels="19 İnç Spor Jant";
    }
    @Override
    public Car getVehicle() {
        return car;
    }
}
