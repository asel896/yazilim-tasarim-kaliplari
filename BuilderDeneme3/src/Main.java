public class Main {
    public static void main(String[] args) {
        SportsCarBuilder sportsCarBuilder = new SportsCarBuilder();

        Director director = new Director(sportsCarBuilder);

        director.createCar();

        Car yeniAraba = sportsCarBuilder.getVehicle();

        yeniAraba.showCar();
    }}