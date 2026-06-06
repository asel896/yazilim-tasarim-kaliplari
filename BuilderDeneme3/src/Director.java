public class Director {
    private CarBuilder carBuilder;

    public Director(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    public void createCar(){
        carBuilder.buildChassis();
        carBuilder.buildWheels();
        carBuilder.buildEngine();

    }
}
